package college.Flightapp.repo;

import college.Flightapp.entity.flights;
import college.Flightapp.entity.reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface flight_repo extends JpaRepository<flights, String> {


}