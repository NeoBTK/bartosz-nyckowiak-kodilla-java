package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Warsaw", "Dubai");
        Flight flight3 = new Flight("Warsaw", "Paris");
        Flight flight4 = new Flight("Warsaw", null);

        List<Flight> flights = Arrays.asList(flight1, flight2, flight3, flight4);

        FlightPlanner flightPlanner = new FlightPlanner();

        for (Flight flight : flights) {
            try {
                boolean fly = flightPlanner.findFlight(flight);
                if (fly) {
                    System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
                } else {
                    System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available.");
                }
            } catch (RouteNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
