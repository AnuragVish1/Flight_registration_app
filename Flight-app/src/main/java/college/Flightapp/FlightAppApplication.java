package college.Flightapp;

import college.Flightapp.service.flight_services;
import college.Flightapp.service.reservation_services_interface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class FlightAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(FlightAppApplication.class, args);
	}

}
