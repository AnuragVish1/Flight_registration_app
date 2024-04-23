package college.Flightapp.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Passengers_details")
public class passengers {
    @Id
    @Column(name = "pid")
    private int pid;


    @OneToOne
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    private reservation reservations;

    @Column(name = "passenger_name")
    private String psg_name;

    @Column(name = "address")
    private String address;
}
