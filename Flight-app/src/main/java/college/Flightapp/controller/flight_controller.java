package college.Flightapp.controller;
import java.lang.String;
import college.Flightapp.entity.flights;
import college.Flightapp.entity.reservation;
import college.Flightapp.service.flight_services;
import college.Flightapp.service.reservation_services_interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/planes")
public class flight_controller {
    @Autowired
    private final flight_services flightServices;
    @Autowired
    private final reservation_services_interface reservationServices;

    public flight_controller(flight_services flightServices, reservation_services_interface reservationServices) {
        this.flightServices = flightServices;
        this.reservationServices = reservationServices;
    }

    @PostMapping("/available_planes")
    public String addFlight(@RequestBody flights flight){
        flightServices.saveFlights(flight);
        return "Flights available";
    }

    

    @GetMapping("/all_flights")
    public List<flights> getAllFlights() {

        return flightServices.getAllFlights();

    }

    @PostMapping("/reservation")
    public String addReservation(@RequestBody reservation Reservations){
        reservationServices.saveReservation(Reservations);
        return "Flights available";
    }


    @GetMapping("/get_reservations")
    public List<reservation> getAllReservations() {
        return reservationServices.getAllreservation();
    }

}

