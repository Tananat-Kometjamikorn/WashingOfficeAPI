package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class HeadQuarter {

    @Id
    private String h_username;
    private String h_password;
    private String h_name;

    @OneToMany(mappedBy = "headQuarter")
    private List<OrderBill> orderBills = new ArrayList<>();

}
