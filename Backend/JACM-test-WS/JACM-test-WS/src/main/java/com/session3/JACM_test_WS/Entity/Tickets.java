package com.session3.JACM_test_WS.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tickets")
public class Tickets extends ABaseEntity{

	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="phone",nullable=false)
	private String phone;
	
	@Column(name="booking_reference",nullable=false)
	private String bookingReference;
	
	@Column(name="passport_number",nullable=false)
	private String passportNumber;
	
	@Column(name="passport_photo",nullable=false)
	private byte[] passportPhoto;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="passpord_country",nullable=false)
	private Countries passporCountry;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="user_id",nullable=false)
	private Users userId;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="schedule_id",nullable=false)
	private Schedules scheduleId;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="cabin_typeid",nullable=false)
	private CabinTypes cabinTypeId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBookingReference() {
		return bookingReference;
	}

	public void setBookingReference(String bookingReference) {
		this.bookingReference = bookingReference;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public byte[] getPassportPhoto() {
		return passportPhoto;
	}

	public void setPassportPhoto(byte[] passportPhoto) {
		this.passportPhoto = passportPhoto;
	}

	public Countries getPassporCountry() {
		return passporCountry;
	}

	public void setPassporCountry(Countries passporCountry) {
		this.passporCountry = passporCountry;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public Schedules getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Schedules scheduleId) {
		this.scheduleId = scheduleId;
	}

	public CabinTypes getCabinTypeId() {
		return cabinTypeId;
	}

	public void setCabinTypeId(CabinTypes cabinTypeId) {
		this.cabinTypeId = cabinTypeId;
	}
	
}
