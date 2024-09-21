package com.richard.ticketing.service;

import com.richard.ticketing.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    List<Event> getAllEvents();
    Optional<Event> getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
}
