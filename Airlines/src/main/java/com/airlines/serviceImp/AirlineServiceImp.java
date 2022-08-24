package com.airlines.serviceImp;

import com.airlines.models.Airline;
//import com.airlines.models.Flight;
import com.airlines.repository.AirlineRepo;
//import com.airlines.repository.FlightRepo;
import com.airlines.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineServiceImp  implements    AirlineService {
    @Autowired
    AirlineRepo repo;
   // @Autowired
   // FlightRepo flightRepo;

    @Override
    public Airline saveAirline(Airline airline) {
        return repo.save(airline);
    }

    @Override
    public List<Airline> getAirlines() {
        return repo.findAll();
    }

    @Override
    public Airline getById(Long id) {
        Optional<Airline> airline = repo.findById(id);
        if (airline.isPresent()) {
            return airline.get();
        } else {
            return null;
        }
    }

    @Override
    public String updateStatus(Airline a, Long id) {
        Airline airline = repo.findById(id).get();
        if (airline.getId() != 0) {
            airline.setAirlineName(a.getAirlineName());
            airline.setId(a.getId());


        } else {
            return id + "Airline is not found ";
        }

        repo.save(airline);
        return "Updated successful";
    }

    @Override
    public void deleteBId(long id) {
        repo.deleteById(id);
    }


}