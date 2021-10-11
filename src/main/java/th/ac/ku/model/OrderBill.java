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
    @Column(name = "order_id" , columnDefinition = "VARCHAR(64)")
    private UUID order_id;

    private String customer;
    private int cost;
    private Date bill_date;

    @OneToOne(mappedBy = "orderBill")
    private OrderInfo orderInfo;

    @ManyToOne
    private HeadQuarter headQuarter;

}
