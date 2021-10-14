package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    private String customer_name;
    private int cost;
    private String bill_date;

    @OneToOne
    @MapsId
    private OrderInfo orderInfo;

    @ManyToOne
    private HeadQuarter headQuarter;

}
