package com.brixton.pago.service;

import com.brixton.pago.dto.request.BookingRequestDTO;
import com.brixton.pago.dto.response.BookingResponseDTO;
import com.brixton.pago.model.Booking;
import com.brixton.pago.model.Payment;
import com.brixton.pago.model.Status;
import com.brixton.pago.model.mapper.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.management.ObjectName;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
public class BookingServiceImpl implements BookingService{

    private static final String USER_APP = "BRIXTON";
    Map<Integer, Booking> bookingMap = new HashMap<>();
    Map<Integer, Payment> payments = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();
    //private final AtomicInteger counter = new AtomicInteger();
    public BookingServiceImpl(){
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });

        //module.addSerializer(LocalDateTimeSerializer);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }
    @Override
    public Object createBooking(BookingRequestDTO inputBooking) {

        try {
            String jsonInput = objectMapper.writeValueAsString(inputBooking);
            Booking booking = objectMapper.readValue(jsonInput, Booking.class);
            booking.setCreatedAt(LocalDateTime.now());
            booking.setCreatedBy(USER_APP);
            bookingMap.put(booking.getId(), booking);

            String jsonOutput = objectMapper.writeValueAsString(booking);
            BookingResponseDTO output = objectMapper.readValue(jsonOutput, BookingResponseDTO.class);
            return output;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getBooking(int id) {

        for(Booking booking: bookingMap.values()){
            try {
                String jsonOutput = objectMapper.writeValueAsString(booking);
                BookingResponseDTO output = objectMapper.readValue(jsonOutput, BookingResponseDTO.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bookingMap.get(id);
    }

    @Override
    public Object processPayment(Booking booking, double amount) {

            // Crear un nuevo objeto Payment
            Payment payment = new Payment();
            if (payment.getBookingId().equals(booking.getId())) {

                payment.setAmount(booking.getPayment().getAmount());
                payment.setStatus(Status.COMPLETED);
                payments.put(payment.getId(), payment);
            }
            // Asociar el pago con la reserva
            booking.setPayment(payment);

            // Actualizar el mapa de reservas con la reserva actualizada
            bookingMap.put(booking.getId(), booking);

            return amount;
    }

    @Override
    public Boolean checkAvailability(int id) {
        Booking requestBooking = bookingMap.get(id);
        if(requestBooking == null){
            return false;
        }
        for(Booking booking: bookingMap.values()){
            //if(booking.getId() != id && )
        }
        return null;
    }
}
