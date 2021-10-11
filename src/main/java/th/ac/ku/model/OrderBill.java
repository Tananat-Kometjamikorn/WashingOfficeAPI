package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class OrderBill {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "VARCHAR(64)")
    private UUID order_id;

    private String customer;
    private int cost;
    private Date bill_date;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private OrderInfo orderInfo;

    @ManyToOne
    private HeadQuarter headQuarter;

}
