/*package com.airlines.serviceImp;

import com.airlines.models.Flight;
import com.airlines.repository.FlightRepo;
import com.airlines.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImp implements FlightService {
    @Autowired
    private FlightRepo flightRepo;
    @Override

    public String blockedFlight(long id) {
        Flight flightEntity=flightRepo.findById(id).get();
        if(flightEntity==null){
            return "no airline found with this id";
        }
        else if(flightEntity.getBlockedStatus()){
            return "Airline is already blocked";
        }

        flightEntity.setBlocked(true);
        return String.valueOf(flightRepo.blockFlight(flightEntity));
    }
}
*/