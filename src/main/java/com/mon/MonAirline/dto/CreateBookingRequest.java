package com.mon.MonAirline.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class CreateBookingRequest {
    @NotBlank(message = "Flight cannot be empty")
    private Long flightId;

    @NotEmpty(message = "At least one passenger must be provided")
    private List<PassengerDto> passengers;
}
