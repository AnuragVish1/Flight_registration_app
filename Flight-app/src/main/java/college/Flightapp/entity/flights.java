package college.Flightapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Flights")
public class flights {
    @Id
    @Column(name = "FLIGHT_ID")
    private int flight_id;

    @Column(name = "FLIGHT_NAME")
    private String flight_name;

    @Column(name = "CURRENT_LOCATION")
    private String current_location;

    @Column(name = "DESTINATION")
    private String destination;

    @Column(name = "DEPARTURE_TIME")
    private String departure_time;

    @Column(name = "ARRIVAL_TIME")
    private String Arrival_time;

    @Column(name = "SEATS_AVAILABLE")
    private int seats_available;

}
