package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Cloth implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "VARCHAR(64)")
    private UUID order_id;

    private String status;
    private int cloth_quantity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private OrderInfo orderInfo;
}
