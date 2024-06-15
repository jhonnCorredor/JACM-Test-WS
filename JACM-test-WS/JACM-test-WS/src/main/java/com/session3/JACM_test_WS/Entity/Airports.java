package com.session3.JACM_test_WS.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="airports")
public class Airports extends ABaseEntity{

	@Column(name="iata_code",nullable=false)
	private String IATACode;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="country_id",nullable=false)
	private Countries countryId;

	public String getIATACode() {
		return IATACode;
	}

	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Countries getCountryId() {
		return countryId;
	}

	public void setCountryId(Countries countryId) {
		this.countryId = countryId;
	}
	
}
