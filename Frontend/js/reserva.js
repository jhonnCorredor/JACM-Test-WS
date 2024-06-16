var retorno = document.getElementById('regreso')
const pasajeros = [];

function vuelos() {
  window.location.href = "../view/vuelos.html";
}

function datosVuelos() {
  var vuelo = localStorage.getItem("vueloSalida");
  var jsonS = JSON.parse(vuelo);

  $("#origenS").text(jsonS.origen);
  $("#destinoS").text(jsonS.destino);
  $("#tipo_cabinaS").text(jsonS.cabina);
  $("#fechaS").text(jsonS.fecha);
  $("#numeroS").text(jsonS.numero);

  if (localStorage.getItem("vueloEntrada")) {
    retorno.style.visibility = 'visible'
    var vuelo = localStorage.getItem("vueloSalida");
    var jsonR = JSON.parse(vuelo);

    $("#origenR").text(jsonR.origen);
    $("#destinoR").text(jsonR.destino);
    $("#tipo_cabinaR").text(jsonR.cabina);
    $("#fechaR").text(jsonR.fecha);
    $("#numeroR").text(jsonR.numero);
  }
}

function countries(){
    $.ajax({
        url: "http://localhost:9000/session3/v1/api/countries",
        method: "GET",
        dataType: "json",
        success: function (response){
            var html = "";
            var data = response.data;

            data.forEach(function (item){
                html += `<option value="${item.id}"> ${item.name}</option>`
            });

            $("#pais_pass").html(html);

        },
        error: function(error) {
            console.error(error);
        }
    });  
}

function pasajaeros() {
    
    var data = {
        "ticket":{
         "firtsName": $("#nombre").val(),
         "lastName" : $("#apellido").val(),
         "birthday" : $("#birthday").val(),
         "phone": $("#telefono").val(),
         "passportNumber": $("#num_pass").val(),
         "passporCountry": {
            "id": parseInt($("#pais_pass").val()),
            "name": $("#pais_pass").text()
         },
         "passportPhoto": [
            $("#formFile").val()
         ]
        }
    }

    pasajeros.push(data)

    table()
}

function table(){
    var html= ''

    pasajeros.forEach(function(item) {
        console.log(item);
        html += `<tr>
        <td> ${item.ticket.firtsName}</td>
        <td> ${item.ticket.lastName}</td>
        <td> ${item.ticket.birthday}</td>  
        <td> ${item.ticket.passportNumber}</td>
        <td> ${item.ticket.passporCountry.name}</td>
        <td> ${item.ticket.phone}</td>
        <td> <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"> pasaporte</button></td>
        </tr>`
    })

    $("#pasajeros").html(html)
}
