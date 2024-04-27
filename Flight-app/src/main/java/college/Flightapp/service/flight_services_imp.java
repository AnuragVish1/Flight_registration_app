package college.Flightapp.service;

import college.Flightapp.entity.flights;
import college.Flightapp.entity.passengers;
import college.Flightapp.entity.reservation;
import college.Flightapp.repo.flight_repo;
import college.Flightapp.repo.reservation_repo;
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

}

