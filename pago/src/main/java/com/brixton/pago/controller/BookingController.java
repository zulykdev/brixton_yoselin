package com.brixton.pago.controller;

import com.brixton.pago.dto.request.BookingRequestDTO;
import com.brixton.pago.model.Booking;
import com.brixton.pago.service.BookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookings")
@Slf4j
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/")
    public ResponseEntity<Object> createBooking(@RequestBody BookingRequestDTO inputBooking){

        return ResponseEntity.ok(bookingService.createBooking(inputBooking));
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getBooking(@PathVariable int id){
        Object bookingTemporal = bookingService.getBooking(id);
        if(bookingTemporal != null){
            return ResponseEntity.ok(bookingTemporal);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/payment")
    public Object processPayment(@RequestBody , double amount){
        return null;
    }
}
