package com.hotel.hotel_service.controller;

import com.hotel.hotel_service.entity.Hotel;
import com.hotel.hotel_service.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {
    @Autowired
    private HotelRepository hotelRepository;

    @PostMapping
    public Hotel saveHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
