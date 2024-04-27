package college.Flightapp.repo;

import college.Flightapp.entity.flights;
import college.Flightapp.entity.reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface reservation_repo extends JpaRepository<reservation, String> {

//    @Query(value = "select user_name from reservation where user_name like %:user_name%")
//    Optional<String> findByuser_name(@Param("user_name")String user_name);




}