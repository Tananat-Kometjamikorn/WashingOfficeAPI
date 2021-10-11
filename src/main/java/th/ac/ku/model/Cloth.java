package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Cloth {

    @Id
    private UUID order_id;
    private String status;
    private int cloth_quantity;
}
