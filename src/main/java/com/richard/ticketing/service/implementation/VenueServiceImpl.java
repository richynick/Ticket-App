package com.richard.ticketing.service.implementation;

import com.richard.ticketing.model.Venue;
import com.richard.ticketing.repository.VenueRepository;
import com.richard.ticketing.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VenueServiceImpl implements VenueService {

    private final VenueRepository venueRepository;

    @Override
    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    @Override
    public Optional<Venue> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    @Override
    public Venue createVenue(Venue venue) {

        Venue newVanue = Venue.builder()
                .name(venue.getName())
                .city(venue.getCity())
                .events(venue.getEvents())
                .address(venue.getAddress())
                .country(venue.getCountry())
                .build();

        Venue createdVenue = venueRepository.save(newVanue);
        return createdVenue;
    }

    @Override
    public Venue updateVenue(Long id, Venue venue) {
        Optional<Venue> existingVenue = venueRepository.findById(id);
        if (existingVenue.isPresent()) {
            Venue updatedVenue = existingVenue.get();
            updatedVenue.setName(venue.getName());
            // Update other fields as necessary
            return venueRepository.save(updatedVenue);
        } else {
            throw new RuntimeException("Venue not found");
        }
    }

    @Override
    public void deleteVenue(Long id) {
        if (venueRepository.existsById(id)) {
            venueRepository.deleteById(id);
        } else {
            throw new RuntimeException("Venue not found");
        }
    }
}
