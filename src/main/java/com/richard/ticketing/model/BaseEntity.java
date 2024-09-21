package com.richard.ticketing.model;

import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * A base class for entities in the Simple Banking App, providing a createdDateTime field.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class BaseEntity {

    /**
     * The date and time when the entity was created.
     */
    private LocalDateTime createdDateTime;

    /**
     * Sets the createdDateTime to the current date and time when an entity is persisted.
     */
    @PrePersist
    public void onCreate(){
        this.createdDateTime=LocalDateTime.now();
    }
}
