package com.richard.ticketing.service.implementation;

import com.richard.ticketing.model.Event;
import com.richard.ticketing.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    @Override
    public List<Event> getAllEvents() {
        return List.of();
    }

    @Override
    public Optional<Event> getEventById(Long id) {
        return Optional.empty();
    }

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        return null;
    }

    @Override
    public void deleteEvent(Long id) {

    }
}
