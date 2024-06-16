package com.session3.JACM_test_WS.Entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users extends ABaseEntity{

	@Column(name="firts_name",nullable=false)
	private String firtsName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="birthdate",nullable=false)
	private LocalDateTime birthdate;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false)
	@JoinColumn(name="role_id", nullable=false)
	private Roles roleID;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false)
	@JoinColumn(name="office_id", nullable=false)
	private Offices officeID;

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}

	public Roles getRoleID() {
		return roleID;
	}

	public void setRoleID(Roles roleID) {
		this.roleID = roleID;
	}

	public Offices getOfficeID() {
		return officeID;
	}

	public void setOfficeID(Offices officeID) {
		this.officeID = officeID;
	}
	
}
