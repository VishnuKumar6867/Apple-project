package com.airlines.repository;

import com.airlines.models.Airline;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirlineRepo extends MongoRepository<Airline, Long> {
}
