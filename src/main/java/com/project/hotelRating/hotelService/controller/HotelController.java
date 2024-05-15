package com.project.hotelRating.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hotelRating.hotelService.entities.Hotel;
import com.project.hotelRating.hotelService.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping("")
	ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel responseHotel = hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(responseHotel);
	}

	@GetMapping
	public ResponseEntity<List<Hotel>> getUsers() {
		return ResponseEntity.ok(hotelService.getAllHotel());
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getUserById(@PathVariable String hotelId) {
		Hotel hotel = hotelService.getHotelById(hotelId);
		return ResponseEntity.ok(hotel);
	}
}
