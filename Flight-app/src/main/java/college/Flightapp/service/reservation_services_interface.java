package college.Flightapp.service;

import college.Flightapp.entity.reservation;

import java.util.List;

public interface reservation_services_interface {
    public reservation saveReservation(reservation reservations);

    public List<reservation> getAllreservation();
    public boolean checkUserCredentials(String username, String inputPassword);

}
