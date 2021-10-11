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
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "VARCHAR(64)")
    private UUID order_id;

    private String b_name;
    private String c_name;
    private String c_phonenum;
    private Date order_date;

    @OneToOne(mappedBy = "orderInfo", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private OrderBill orderBill;

    @OneToOne(mappedBy = "orderInfo", cascade = CascadeType.ALL,
              fetch = FetchType.LAZY, optional = false)
    private Cloth cloth;

    @ManyToOne
    private Branch branch;
}
