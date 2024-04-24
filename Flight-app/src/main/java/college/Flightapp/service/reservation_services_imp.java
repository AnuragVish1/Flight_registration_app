package college.Flightapp.service;

import college.Flightapp.entity.reservation;
import college.Flightapp.repo.flight_repo;
import college.Flightapp.repo.reservation_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reservation_services_imp implements reservation_services_interface{


    @Autowired
    private reservation_repo reservationRepo;

    @Override
    public reservation saveReservation(reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public List<reservation> getAllreservation() {
        return reservationRepo.findAll();
    }


    public boolean checkUserCredentials(String username, String inputPassword) {

        reservation user = reservationRepo.findByuser_name(username); // Retrieve the user entity
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
