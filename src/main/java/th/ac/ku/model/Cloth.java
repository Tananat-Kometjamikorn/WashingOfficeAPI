package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cloth{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    private String status;
    private int cloth_quantity;

    @OneToOne
    @MapsId
    private OrderInfo orderInfo;
}
