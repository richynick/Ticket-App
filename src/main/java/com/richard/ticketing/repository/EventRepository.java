package com.richard.ticketing.repository;

import com.richard.ticketing.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
