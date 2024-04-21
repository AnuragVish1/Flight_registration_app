package college.Flightapp.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "payment_details")
public class payment_details {

    @Id
    @Column(name = "payid")
    private int payid;

    @OneToOne
    @JoinColumn(name = "jid", referencedColumnName = "jid")
    private journey_details Journey_details;

    @Column(name = "amount")
    private int amount;

}
