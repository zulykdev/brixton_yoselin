package com.brixton.pago.service;

import com.brixton.pago.dto.request.BookingRequestDTO;
import com.brixton.pago.model.Booking;

public interface BookingService {
    Object createBooking(BookingRequestDTO booking);
    Object getBooking(int id);

    Object processPayment(Booking booking, double amount);
    Boolean checkAvailability(int id);

}
