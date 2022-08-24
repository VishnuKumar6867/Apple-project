package com.airlines.services;

import com.airlines.models.Airline;
//import com.airlines.models.Flight;

import java.util.List;


public interface AirlineService {

    public Airline saveAirline(Airline airline);

   public  List<Airline> getAirlines();

   public Airline getById(Long id);

   public String updateStatus(Airline a,Long id);

   public  void deleteBId(long id);



}
