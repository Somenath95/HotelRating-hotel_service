package com.project.hotelRating.hotelService.services;

import java.util.List;

import com.project.hotelRating.hotelService.entities.Hotel;

public interface HotelService {

	//create
	Hotel createHotel(Hotel hotel);
	
	//get all
	List<Hotel> getAllHotel();
	
	//get by id
	Hotel getHotelById(String hotelId);
	
	//update
	
	//delete
}
