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
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    private String b_name;
    private String c_name;
    private String c_phonenum;
    private String order_date;

    @OneToOne(mappedBy = "orderInfo")
    private OrderBill orderBill;

    @OneToOne(mappedBy = "orderInfo")
    private Cloth cloth;

    @ManyToOne
    private Branch branch;
}
