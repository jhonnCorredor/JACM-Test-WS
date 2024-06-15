package com.session3.JACM_test_WS.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="aircrafts")
public class Aircrafts extends ABaseEntity{

	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="make_model",nullable=false)
	private String makeModel;
	
	@Column(name="total_seats",nullable=false)
	private Double totalSeats;
	
	@Column(name="economy_seats",nullable=false)
	private Double economySeats;
	
	@Column(name="Bussines_seats",nullable=false)
	private Double bussinesSeats;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}

	public Double getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Double totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Double getEconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(Double economySeats) {
		this.economySeats = economySeats;
	}

	public Double getBussinesSeats() {
		return bussinesSeats;
	}

	public void setBussinesSeats(Double bussinesSeats) {
		this.bussinesSeats = bussinesSeats;
	}
	
}
