package com.meleva.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private User driver;

    @NotBlank
    private String origin;

    @NotBlank
    private String destination;

    @NotNull
    private LocalDateTime departureTime;

    @NotNull
    private Integer availableSeats;

    @NotNull
    private Double pricePerSeat;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public enum Status {
        ACTIVE, FULL, CANCELLED, COMPLETED
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getDriver() { return driver; }
    public void setDriver(User driver) { this.driver = driver; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalDateTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalDateTime departureTime) { this.departureTime = departureTime; }

    public Integer getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(Integer availableSeats) { this.availableSeats = availableSeats; }

    public Double getPricePerSeat() { return pricePerSeat; }
    public void setPricePerSeat(Double pricePerSeat) { this.pricePerSeat = pricePerSeat; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}