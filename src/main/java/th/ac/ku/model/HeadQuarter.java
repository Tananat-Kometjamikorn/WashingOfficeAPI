package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

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
    @OneToMany(mappedBy = "headQuarter", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<OrderBill> orderBills;

}
