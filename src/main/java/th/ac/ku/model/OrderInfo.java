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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String branchName;
    private String customerName;
    private String customerPhone;
    private String orderDate;

    @OneToOne(mappedBy = "orderInfo")
    @PrimaryKeyJoinColumn
    private OrderBill orderBill;

    @OneToOne(mappedBy = "orderInfo")
    @PrimaryKeyJoinColumn
    private Cloth cloth;

    @ManyToOne
    private Branch branch;
}
