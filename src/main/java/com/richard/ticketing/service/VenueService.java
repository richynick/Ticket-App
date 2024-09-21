package com.richard.ticketing.service;

import com.richard.ticketing.model.Venue;

import java.util.List;
import java.util.Optional;

public interface VenueService {

    List<Venue> getAllVenues();
    Optional<Venue> getVenueById(Long id);
    Venue createVenue(Venue venue);
    Venue updateVenue(Long id, Venue venue);
    void deleteVenue(Long id);
}
