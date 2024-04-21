package college.Flightapp.entity;




import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "Journey_details")
public class journey_details {

    @Id
    @Column(name = "jid")
    private int jid;

    @ManyToOne
    @JoinColumn(name = "pid", referencedColumnName = "pid")
    private passengers Passengers;

    @ManyToOne
    @JoinColumn(name = "FLIGHT_ID", referencedColumnName = "FLIGHT_ID")
    private flights flight;

    @Column(name = "Time_of_journey")
    private Date time_of_journey;

    @Column(name = "number_of_passangers")
    private int number_of_passangers;

}
