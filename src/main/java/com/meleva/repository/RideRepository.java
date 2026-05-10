package com.meleva.repository;

import com.meleva.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Long> {
    List<Ride> findByStatus(Ride.Status status);
    List<Ride> findByDriverId(Long driverId);
}