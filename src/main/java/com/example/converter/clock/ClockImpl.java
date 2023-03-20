package com.example.converter.clock;

import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class ClockImpl implements Clock {
    @Override
    public ZonedDateTime getApplicationZonedDateTime() {
        return ZonedDateTime.now(APPLICATION_ZONE_ID);
    }
}

