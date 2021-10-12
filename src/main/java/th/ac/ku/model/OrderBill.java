package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class OrderBill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    private String customer;
    private int cost;
    private String bill_date;

    @OneToOne
    @PrimaryKeyJoinColumn
    @MapsId
    private OrderInfo orderInfo;

    @ManyToOne
    private HeadQuarter headQuarter;

}
