package com.project.hotelRating.hotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hotelRating.hotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
