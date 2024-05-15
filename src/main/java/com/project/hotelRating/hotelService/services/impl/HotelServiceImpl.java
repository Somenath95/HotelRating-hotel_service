package com.project.hotelRating.hotelService.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hotelRating.hotelService.entities.Hotel;
import com.project.hotelRating.hotelService.exceptions.ResourceNotFoundException;
import com.project.hotelRating.hotelService.repositories.HotelRepository;
import com.project.hotelRating.hotelService.services.HotelService;

import jakarta.persistence.Column;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomHotelId = UUID.randomUUID().toString();
		hotel.setHotelId(randomHotelId);
		return hotelRepository.save(hotel); 
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		List<Hotel> hotelList = hotelRepository.findAll();
		return hotelList;
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel not found with this id!! " + hotelId));
	}

}
