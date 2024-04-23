package college.Flightapp.service;

import college.Flightapp.entity.flights;
import college.Flightapp.entity.passengers;
import college.Flightapp.entity.reservation;
import college.Flightapp.repo.flight_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class flight_services_imp implements flight_services{

   @Autowired
   private flight_repo flightRepo;
    @Override
    public flights saveFlights(flights flight) {
        return flightRepo.save(flight);
    }

    @Override
    public List<flights> getAllFlights() {
        return flightRepo.findAll();
    }

    @Override
    public void print_flights(List<flights> flight) {
        for (flights f1 : flight) {
            System.out.println("Flight ID: " + f1.getFlight_id() +
                    ", Flight Name: " + f1.getFlight_name() +
                    ", Current Location: " + f1.getCurrent_location() +
                    ", Destination: " + f1.getDestination() +
                    ", Departure Time: " + f1.getDeparture_time() +
                    ", Arrival Time: " + f1.getArrival_time() +
                    ", Seats Available: " + f1.getSeats_available());
        }
    }

    @Autowired
    private flight_repo userRepository;
    public boolean checkUserCredentials(String username, String inputPassword) {
        reservation user = userRepository.findByuser_name(username); // Retrieve the user entity
        if (user != null) {
            if (user.getPassword().equals(inputPassword))
            {
                return true; // Password matches
            }
            return false; // Compare passwords
        }
        return false; // User not found or password does not match
    }



}

