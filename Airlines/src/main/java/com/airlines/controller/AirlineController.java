package com.airlines.controller;

import com.airlines.models.Airline;
//import com.airlines.models.Flight;
import com.airlines.serviceImp.AirlineServiceImp;
//import com.airlines.serviceImp.FlightServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AirlineController<airline> {
    @Autowired
   private AirlineServiceImp service;
    //@Autowired
    //private FlightServiceImp flightservice;


    @PostMapping("/add")
    public String saveAirline(@RequestBody Airline airline){
        service.saveAirline(airline);
        return "Added with airline id:"+airline.getId();

    }
    @GetMapping("/findairlines")
    public List<Airline> getAirlines(){
        return service.getAirlines();

    }
    @GetMapping("/findById/{id}")
public Airline getById(@PathVariable Long id)
    {
        return service.getById(id);
    }
    @PutMapping("/updateAirline/{id}")
    public String updateStatus(@RequestBody Airline airline, @PathVariable("id")long id){
        return service.updateStatus(airline,id);
    }
    @DeleteMapping("/delete/{id}")
     public String deleteByid(@PathVariable ("id")long id){
         service.deleteBId(id);
         return "Deleted with Airline"+getById(id);
    }
/*@PutMapping("/airline/block/{id}")
    public Flight blockFlight(@PathVariable("id")long id) {
    String flight = flightservice.blockedFlight(id);
      return null;
}*/
}
