package college.Flightapp.service;

import college.Flightapp.entity.reservation;
import college.Flightapp.repo.flight_repo;
import college.Flightapp.repo.reservation_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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


//    public boolean checkUserCredentials(String username, String inputPassword) {
//
//        Optional<String> userOpt = reservationRepo.findByuser_name(username); // Retrieve the user entity
//         // Retrieve the password entity
//        if (userOpt.isPresent()) {
//
//            /*
//            if (passwordOpt.isPresent())
//            {
//                return true; // Password matches
//            }
//
//             */
//
//
//            return true; // Compare passwords
//        }
//        return false; // User not found or password does not matc
}
