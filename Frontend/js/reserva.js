var retorno = document.getElementById("regreso");
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
    retorno.style.visibility = "visible";
    var vuelo = localStorage.getItem("vueloSalida");
    var jsonR = JSON.parse(vuelo);

    $("#origenR").text(jsonR.origen);
    $("#destinoR").text(jsonR.destino);
    $("#tipo_cabinaR").text(jsonR.cabina);
    $("#fechaR").text(jsonR.fecha);
    $("#numeroR").text(jsonR.numero);
  }
}

function countries() {
  $.ajax({
    url: "http://localhost:9000/session3/v1/api/countries",
    method: "GET",
    dataType: "json",
    success: function (response) {
      var html = "";
      var data = response.data;

      data.forEach(function (item) {
        html += `<option value="${item.id}"> ${item.name}</option>`;
      });

      $("#pais_pass").html(html);
    },
    error: function (error) {
      console.error(error);
    },
  });
}

function pasajaeros() {

    const reader = new FileReader();
    var photo;

    reader.onload = function(event){
        const ArrayBuffer = event.target.result;
        const byte = Uint8Array(ArrayBuffer)
        photo = byte;
    }

  var data = {
    ticket: {
      firtsName: $("#nombre").val(),
      lastName: $("#apellido").val(),
      birthday: $("#birthday").val(),
      phone: $("#telefono").val(),
      passportNumber: $("#num_pass").val(),
      passporCountry: {
        id: parseInt($("#pais_pass").val()),
        name: $("#pais_pass option:selected").text(),
      }, 
      passportPhoto: photo,
    },
  };

  pasajeros.push(data);

  tablePasajero();
}

function tablePasajero() {
  var html = "";

  pasajeros.forEach(function (item, index) {
    html += `<tr data-id="${index}">
        <td hidden> ${index}</td>
        <td> ${item.ticket.firtsName}</td>
        <td> ${item.ticket.lastName}</td>
        <td> ${item.ticket.birthday}</td>  
        <td> ${item.ticket.passportNumber}</td>
        <td> ${item.ticket.passporCountry.name}</td>
        <td> ${item.ticket.phone}</td>
        <td> <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="modalPassport(${index})" > pasaporte</button></td>
        <td>  <input type="checkbox" name="" id="check${index}"> </td>
        </tr>`;
  });

  
  $("#pasajeros").html(html);
  
  $("#pasajeros tr").click(function(){
    $("#pasajeros input[type='checkbox']").prop('checked', false);
    $(this).find("input[type='checkbox']").prop('checked', true);

    localStorage.setItem('indexPasajero', $(this).data('id'))
  })
  
}

function modalPassport(index){
    var pasajero = JSON.stringify(pasajeros[index]);
    var ticket = JSON.parse(pasajero)
    var img = document.getElementById('imagen')


    $("#pass_num").text(ticket.ticket.passportNumber)
    $("#pass_pais").text(ticket.ticket.passporCountry.name)
    img.src= ticket.ticket.passporCountry[0]
}


function guardarTicket(){
    var vueloEntrada = localStorage.getItem("vueloEntrada");
    var jsonE = JSON.parse(vueloEntrada);
    var vueloSalida = localStorage.getItem("vueloSalida");

    console.log(vueloEntrada.id);
    pasajeros.forEach( function(item) {
        var Data =  {
            "state": true,
            "firstName": item.ticket.firtsName,
            "lastName": item.ticket.lastName,
            "email": "string",
            "phone": item.ticket.phone,
            "passportNumber": item.ticket.passportNumber,
            "passportPhoto" : [item.ticket.passportPhoto],
            "passporCountry": {"id": item.ticket.passporCountry.id},
            "userId": { "id": 1},
            "bookingReference": "string",
            "scheduleId": { "id": jsonE.id},
            "cabinTypeId": { "id": 1}
        }

        var json = JSON.stringify(Data)
        $.ajax({
            url: "http://localhost:9000/session3/v1/api/tickets",
            method: "POST",
            dataType: "json",
            contentType: "application/json",
            data: json,
            success: function (response){
                alert("Reserva agregada.")
            },
            error: function (error){
                alert("Error: "+error)
            } 
        })
    })
}

function eliminarPasajero(){
    try {
        var indexP = localStorage.getItem('indexPasajero')
    
        pasajeros.splice(indexP)

        alert("Pasajero eliminado.")

        tablePasajero()
    } catch (error) {
        alert("Error: "+error)
    }
    
}
