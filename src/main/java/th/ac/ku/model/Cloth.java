package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Cloth {

    @Id
    @Column(name = "order_id", columnDefinition = "VARCHAR(64)")
    private UUID order_id;

    private String status;
    private int cloth_quantity;

    @OneToOne(mappedBy = "cloth")
    private OrderInfo orderInfo;
}
