package com.mon.MonAirline.dto;

import com.mon.MonAirline.entity.Booking;
import com.mon.MonAirline.enums.PassengerType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PassengerDto {
    private Long id;

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    private String passportNumber;

    @NotNull(message = "Passenger type cannot be empty")
    private PassengerType passengerType;

    private String seatNumber;

    private String specialRequest;
}
