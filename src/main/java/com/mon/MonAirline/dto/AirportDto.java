package com.mon.MonAirline.dto;

import com.mon.MonAirline.enums.City;
import com.mon.MonAirline.enums.Country;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class AirportDto {
    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "city is required")
    private City city;

    @NotBlank(message = "country is required")
    private Country country;

    @NotBlank(message = "iataCode is required")
    private String iataCode;
}
