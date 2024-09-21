package com.richard.ticketing.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticketCode; // Unique code for each ticket

    private Double price;

    @Enumerated(EnumType.STRING)
    private TicketStatus status; // AVAILABLE, BOOKED, SOLD, CANCELLED

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order; // Ticket belongs to an order once purchased
}
