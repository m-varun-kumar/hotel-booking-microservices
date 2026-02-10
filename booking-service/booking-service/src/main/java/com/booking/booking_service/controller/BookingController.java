package com.booking.booking_service.controller;

import com.booking.booking_service.entity.Booking;
import com.booking.booking_service.external.HotelClient;
import com.booking.booking_service.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private HotelClient hotelClient;

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        hotelClient.getHotels(); // verify hotel service
        return bookingRepository.save(booking);
    }
}

