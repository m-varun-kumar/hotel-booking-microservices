package com.booking.booking_service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelClient {

    @GetMapping("/api/hotels")
    List<Object> getHotels();
}

