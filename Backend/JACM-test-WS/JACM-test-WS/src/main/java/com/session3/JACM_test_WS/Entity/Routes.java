package com.session3.JACM_test_WS.Entity;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="routes")
public class Routes extends ABaseEntity{

	@Column(name="distance",nullable=false)
	private String distance;
	
	@Column(name="flight_time",nullable=false)
	private LocalTime flight_time;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="departure_airportid",nullable=false)
	private Airports departureAirportId;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="arrival_airportid",nullable=false)
	private Airports arrivalAirportId;

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public LocalTime getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(LocalTime flight_time) {
		this.flight_time = flight_time;
	}

	public Airports getDepartureAirportId() {
		return departureAirportId;
	}

	public void setDepartureAirportId(Airports departureAirportId) {
		this.departureAirportId = departureAirportId;
	}

	public Airports getArrivalAirportId() {
		return arrivalAirportId;
	}

	public void setArrivalAirportId(Airports arrivalAirportId) {
		this.arrivalAirportId = arrivalAirportId;
	}
	
}
