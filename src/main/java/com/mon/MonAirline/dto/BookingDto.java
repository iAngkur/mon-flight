package com.mon.MonAirline.dto;

import com.mon.MonAirline.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data @AllArgsConstructor @NoArgsConstructor
public class BookingDto {
    private Long id;

    private String bookingReference;

    private UserDto user;

    private FlightDto flight;

    private LocalDateTime bookingDate;

    private BookingStatus bookingStatus;

    private List<PassengerDto> passengers;
}


