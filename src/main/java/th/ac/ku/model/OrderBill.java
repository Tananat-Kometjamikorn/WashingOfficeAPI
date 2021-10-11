package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class OrderBill {
    @Id
    @Column(name = "order_id")
    private UUID order_id;
    private String customer;
    private int cost;
    private Date bill_date;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private OrderInfo orderInfo;

    @ManyToOne
    private HeadQuarter headQuarter;

}
