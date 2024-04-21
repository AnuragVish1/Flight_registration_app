package college.Flightapp.service;

import college.Flightapp.entity.flights;
import org.springframework.stereotype.Service;

import java.util.List;

public interface flight_services {
    public flights saveFlights(flights flight);
    public List<flights> getAllFlights();
}
