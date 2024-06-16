package com.session3.JACM_test_WS.Entity;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="schedules")
public class Schedules extends ABaseEntity{

	@Column(name="date", nullable=false)
	private LocalDate date;
	
	@Column(name="time", nullable=false)
	private LocalTime time;
	
	@Column(name="economy_pryce",nullable=false)
	private Double economyPryce;
	
	@Column(name="flight_number",nullable=false)
	private String flightNumber;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="aircraft_id",nullable=false)
	private Aircrafts aircraftId;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="route_id",nullable=false)
	private Routes routeId;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Double getEconomyPryce() {
		return economyPryce;
	}

	public void setEconomyPryce(Double economyPryce) {
		this.economyPryce = economyPryce;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Aircrafts getAircraftId() {
		return aircraftId;
	}

	public void setAircraftId(Aircrafts aircraftId) {
		this.aircraftId = aircraftId;
	}

	public Routes getRouteId() {
		return routeId;
	}

	public void setRouteId(Routes routeId) {
		this.routeId = routeId;
	}
	
}
