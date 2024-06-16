var checkboxReturn = document.getElementById('retorn')
var checkboxIda = document.getElementById('ida')
var buttonReserva = document.getElementById('reserva')
var pasajeros = document.getElementById('pasajeros')
var table = document.getElementById('table')
var localdate = document.getElementById('inputlocal')
document.addEventListener('DOMContentLoaded', function(){

    checkboxReturn.addEventListener('change', function(){
        if(checkboxReturn.checked){
            checkboxIda.checked=false
            table.style.visibility = 'visible'
            localdate.style.visibility = 'visible'
        }
    })

    checkboxIda.addEventListener('change', function(){
        if(checkboxIda.checked){
            checkboxReturn.checked=false
            table.style.visibility = 'hidden'
            localdate.style.visibility = 'hidden'
        }
    })

    pasajeros.addEventListener('change', function(){
        verificacion()
    })

})

function verificacion() {
if (checkboxIda.checked) {
    if (localStorage.getItem('vueloSalida')) {
        var vuelo = localStorage.getItem('vueloSalida')
        var json = JSON.parse(vuelo)
        pasajeros.max = json.asientos
        if ($("#pasajeros").val() > 0 && $("#pasajeros").val()< json.asientos) {
            buttonReserva.disabled = false;
        } else {
        buttonReserva.disabled = true;
        }
    } else {
        buttonReserva.disabled = true;
    } 
} else if(checkboxReturn.checked){
    if (localStorage.getItem('vueloSalida') && localStorage.getItem('vueloEntrada')) {
        var vuelo = localStorage.getItem('vueloSalida')
        var json = JSON.parse(vuelo)
        pasajeros.max = json.asientos
        if ($("#pasajeros").val() > 0 && $("#pasajeros").val()< json.asientos) {
            buttonReserva.disabled = false;
        } else {
        buttonReserva.disabled = true;
        }
    } else {
        buttonReserva.disabled = true;
    } 
}

}


function buscar(){
    vuelosSalida();
    if(checkboxReturn.checked){
        vuelosRegreso();
    }
}

function reserva(){
    window.location.href= "../view/reserva.html"
}


function vuelosSalida(){
try {

    if (checkboxReturn.checked) {
        var data1= {
            "origen" : $("#origen").val(),
            "destino" : $("#destino").val(),
            "fecha1" : $("#fecha_salida").val(),
            "fecha2" : $("#fecha_regreso").val()
        }
    } else {
        var data1= {
            "origen" : $("#origen").val(),
            "destino" : $("#destino").val(),
            "fecha1" : $("#fecha_salida").val(),
            "fecha2" : $("#fecha_salida").val()
        }
    }

    var jsonData1 = JSON.stringify(data1);

    $.ajax({
        url: "http://localhost:9000/session3/v1/api/schedules/vuelos",
        method: "POST",
        dataType: "json",
        contentType: "application/json",
        data: jsonData1,
        success: function (response){

            var html = "";
            var data = response.data;

            data.forEach(function (item){
                html += `<tr data-id="${item.id}" 
                data-origen="${item.origen}"
                data-destino="${item.destino}"
                data-fecha="${item.fecha}"
                data-hora="${item.hora}"
                data-numero="${item.numero}"
                data-precio="${item.precio}"
                data-asientos="${item.asientos}">
                <td> ${item.origen}</td>
                <td> ${item.destino}</td>
                <td> ${item.fecha} </td>
                <td> ${item.hora}</td>
                <td> ${item.numero}</td>
                <td> $${item.precio}</td>
                <td> <input type="checkbox" name="" id="check${item.id}"></td>
                </tr>`
            });

            $("#vuelosSalida").html(html);

            $("#vuelosSalida tr").click(function() {
                $("#vuelosSalida input[type='checkbox']").prop('checked', false);
                $(this).find("input[type='checkbox']").prop('checked', true);
                var selectedData = {
                    id: $(this).data('id'),
                    origen: $(this).data('origen'),
                    destino: $(this).data('destino'),
                    fecha: $(this).data('fecha'),
                    hora: $(this).data('hora'),
                    numero: $(this).data('numero'),
                    precio: $(this).data('precio'),
                    asientos: $(this).data('asientos'),
                    cabina: $("#cabina").val()
                };
                localStorage.setItem('vueloSalida', JSON.stringify(selectedData));
                verificacion();
            });
        }
    })
} catch (error) {
    console.error(error);
}
}


function vuelosRegreso(){
try {
    var data1= {
        "origen" : $("#destino").val(),
        "destino" : $("#origen").val(),
        "fecha1" : $("#fecha_salida").val(),
        "fecha2" : $("#fecha_regreso").val()
    }

    var jsonData1 = JSON.stringify(data1);

    $.ajax({
        url: "http://localhost:9000/session3/v1/api/schedules/vuelos",
        method: "POST",
        dataType: "json",
        contentType: "application/json",
        data: jsonData1,
        success: function (response){

            var html = "";
            var data = response.data;

            data.forEach(function (item){
                html += `<tr data-id="${item.id}" 
                data-origen="${item.origen}"
                data-destino="${item.destino}"
                data-fecha="${item.fecha}"
                data-hora="${item.hora}"
                data-numero="${item.numero}"
                data-precio="${item.precio}"
                data-asientos="${item.asientos}">
                <td> ${item.origen}</td>
                <td> ${item.destino}</td>
                <td> ${item.fecha} </td>
                <td> ${item.hora}</td>
                <td> ${item.numero}</td>
                <td> $${item.precio}</td>
                <td> <input type="checkbox" name="" id="check${item.id}"></td>
                </tr>`
            });


            $("#vuelosRegreso").html(html);

            $("#vuelosRegreso tr").click(function() {
                $("#vuelosRegreso input[type='checkbox']").prop('checked', false);
                $(this).find("input[type='checkbox']").prop('checked', true);
                var selectedData = {
                    id: $(this).data('id'),
                    origen: $(this).data('origen'),
                    destino: $(this).data('destino'),
                    fecha: $(this).data('fecha'),
                    hora: $(this).data('hora'),
                    numero: $(this).data('numero'),
                    precio: $(this).data('precio'),
                    asientos: $(this).data('asientos'),
                    cabina: $("#cabina").val()
                };
                localStorage.setItem('vueloEntrada', JSON.stringify(selectedData));
                verificacion();
            });
        }
    })
} catch (error) {
    console.error(error);
}
}

function aeropuerto(){
    $.ajax({
        url: "http://localhost:9000/session3/v1/api/airports",
        method: "GET",
        dataType: "json",
        success: function (response){
            var html = "";
            var data = response.data;

            data.forEach(function (item){
                html += `<option value="${item.name}"> ${item.name}</option>`
            });

            $("#origen").html(html);
            $("#destino").html(html);

        },
        error: function(error) {
            console.error(error);
        }
    });
}