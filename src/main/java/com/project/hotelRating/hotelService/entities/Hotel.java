package com.project.hotelRating.hotelService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@Column(name = "ID")
	private String hotelId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "REMARK")
	private String remark;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Hotel(String hotelId, String name, String location, String remark) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
		this.remark = remark;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
