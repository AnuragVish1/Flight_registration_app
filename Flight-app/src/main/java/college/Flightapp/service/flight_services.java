package college.Flightapp.service;

import college.Flightapp.entity.flights;
import college.Flightapp.repo.flight_repo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface flight_services {
    public flights saveFlights(flights flight);
    public List<flights> getAllFlights();
    public void print_flights(List<flights> flight);
    public boolean checkUserCredentials(String username, String inputPassword);

}
