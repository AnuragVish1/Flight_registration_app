package college.Flightapp.repo;

import college.Flightapp.entity.flights;
import college.Flightapp.entity.reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reservation_repo extends JpaRepository<reservation, String> {

    reservation findByuser_name(String user_name);

}