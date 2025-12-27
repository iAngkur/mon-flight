package com.mon.MonAirline.service;

import com.mon.MonAirline.entity.Booking;
import com.mon.MonAirline.entity.User;

public interface EmailNotificationService {
    void sendBookingTicketEmail(Booking booking);
    void sendWelcomeEmail(User user);
}
