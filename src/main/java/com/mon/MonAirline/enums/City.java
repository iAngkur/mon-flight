package com.mon.MonAirline.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum City {
    DHAKA(Country.BANGLADESH),
    SYLHET(Country.BANGLADESH),
    MIAMI(Country.USA),
    DALLAS(Country.USA),
    LONDON(Country.UK),
    LEEDS(Country.UK),
    MUMBAI(Country.INDIA),
    KOLKATA(Country.INDIA);


    private final Country country;
}
