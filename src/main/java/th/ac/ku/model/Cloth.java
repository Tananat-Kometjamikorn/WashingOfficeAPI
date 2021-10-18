package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cloth{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    private String status;
    private int clothQuantity;

    @OneToOne
    @MapsId
    private OrderInfo orderInfo;
}
