package com.session3.JACM_test_WS.Dto;

import java.time.LocalDate;

public class filtro {

	private String origen;
	private String destino;
	private LocalDate fecha1;
	private LocalDate fecha2;
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}
	
}
