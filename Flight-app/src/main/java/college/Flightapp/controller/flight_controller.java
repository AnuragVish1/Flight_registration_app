package college.Flightapp.controller;
import java.lang.String;
import college.Flightapp.entity.flights;
import college.Flightapp.service.flight_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class flight_controller {
    @Autowired
    private flight_services flightServices;

    @PostMapping("/available_planes")
    public String add(@RequestBody flights flight){
        flightServices.saveFlights(flight);
        return "Flights available";
    }

    

    @GetMapping("/all_flights")
    public List<flights> getAllFlights() {

        return flightServices.getAllFlights();

    }


}

