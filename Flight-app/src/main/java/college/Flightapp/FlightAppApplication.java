package college.Flightapp;

import college.Flightapp.service.flight_services;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class FlightAppApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FlightAppApplication.class, args) ;
		flight_services flightService = context.getBean(flight_services.class);
		flightService.print_flights(flightService.getAllFlights());
		System.out.println("            ______\n" +
				"            _\\ _~-\\___\n" +
				"    =  = ==(____AA____D\n" +
				"                \\_____\\___________________,-~~~~~~~`-.._\n" +
				"                /     o O o o o o O O o o o o o o O o  |\\_\n" +
				"                `~-.__        ___..----..                  )\n" +
				"                      `---~~\\___________/------------`````\n" +
				"                      =  ===(_________D");
		System.out.println("Welcome to GoAnyWhere");
		System.out.println("Are you already a customer? y/n");
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		if (answer.equals("y"))
		{
			//TODO:

			//ask the user for the username and password
			System.out.println("Enter your UserName");
			String UserName = input.nextLine();
			//match the password field with the database
			System.out.println("Enter your Password");
			String Password = input.nextLine();
			boolean isValid = flightService.checkUserCredentials(UserName, Password);
				//if the password matches,proceed
				if (isValid)
				{
					System.out.println("Welcome " + UserName);
                    System.out.println("What would you like to do?");
                    System.out.println("1. Book a flight");
                    System.out.println("2. Cancel a flight");
                    System.out.println("3. View all flights");
                    System.out.println("4. Exit");
				}

				//if the password does not match, print an error message

				else
				{
					System.out.println("Credentials do not match");
				}


		}
		else
		{
			//TODO:

            //create a new customer account
            //ask the user for the username , password , emailid , phoneNumber
            //save the username and password in the database
            //print a success message
		}


	}

}
