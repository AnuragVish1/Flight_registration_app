package college.Flightapp.entity;




import jakarta.persistence.*;
import lombok.Data;

import lombok.Data;

import javax.swing.*;

@Entity
@Data
@Table (name = "reservation")
public class reservation {

    @Id
    @Column (name = "rid")
    private int rid;

    @Column (name = "user_name")
    private String user_name;

    @Column (name = "password")
    private String password;

    @Column (name = "phone_number")
    private long phone_number;

    @Column (name = "date_of_birth")
    private String date_of_birth;

    @ManyToOne
    @JoinColumn(name = "cid_city", referencedColumnName = "cid_city")
    private citybl citybls;


}
