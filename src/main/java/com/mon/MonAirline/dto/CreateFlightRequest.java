package com.mon.MonAirline.dto;

import com.mon.MonAirline.enums.FlightStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class CreateFlightRequest {
    private Long id;

    @NotBlank(message = "Flight number cannot be blank")
    private String flightNumber;

    private FlightStatus flightStatus;

    @NotBlank(message = "Departure airport IATA cannot be blank")
    private String departureAirportIataCode;

    @NotBlank(message = "Arrival airport IATA cannot be blank")
    private String arrivalAirportIataCode;

    @NotBlank(message = "Departure time cannot be blank")
    private LocalDateTime departureTime;

    @NotBlank(message = "Arrival time cannot be blank")
    private LocalDateTime arrivalTime;

    @NotNull(message = "Base price cannot be empty")
    @Positive(message = "Base price must be positive")
    private BigDecimal basePrice;

    private Long pilotId;
}
