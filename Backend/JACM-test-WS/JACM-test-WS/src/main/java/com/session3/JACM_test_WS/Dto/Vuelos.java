package com.session3.JACM_test_WS.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Vuelos {

	Long getId();
	String getOrigen();
	String getDestino();
	LocalDate getFecha();
	LocalTime getHora();
	String getNumero();
	Double getPrecio();
	Double getAsientos();
	}
