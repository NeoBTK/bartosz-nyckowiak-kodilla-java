package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightPlanner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Madrid", true);
        flightMap.put("Berlin", false);
        flightMap.put("New York", true);
        flightMap.put("Tel Aviv", false);
        flightMap.put("Beijing", true);
        flightMap.put("Dubai", true);

        if (flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival Airport " + flight.getArrivalAirport() + " does not exist in database.");
        }
    }
}
