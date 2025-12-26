package com.mon.MonAirline.repository;

import com.mon.MonAirline.entity.Flight;
import com.mon.MonAirline.enums.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    boolean existsByFlightNumber(String flightNumber);

    List<Flight> findByDepartureAirport_IataCodeAndArrivalAirport_IataCodeAndFlightStatusAndDepartureTimeBetween(
            String departureIataCode, String arrivalIataCode, FlightStatus flightStatus, LocalDateTime startOfDay, LocalDateTime endOfDay);
}
