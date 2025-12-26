package com.mon.MonAirline.dto;

import com.mon.MonAirline.entity.Airport;
import com.mon.MonAirline.entity.User;
import com.mon.MonAirline.enums.FlightStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class FlightDto {
    private Long id;

    private String flightNumber;

    private FlightStatus flightStatus;

    private AirportDto departureAirport;

    private AirportDto arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private UserDto assignedPilot;

    private List<BookingDto> bookings;

    private String departureAirportIataCode;

    private String arrivalAirportIataCode;
}
