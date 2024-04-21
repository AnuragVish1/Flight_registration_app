package college.Flightapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "citybl")
public class citybl {

    @Id
    @Column(name = "cid_city")
    private int cid;

    @Column(name = "city_name")
    private String city_name;
}
