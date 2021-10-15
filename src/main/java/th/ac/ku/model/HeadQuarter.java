package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class HeadQuarter {

    @Id
    private String h_username;
    private String h_password;
    private String h_name;

    @OneToMany(mappedBy = "headQuarter")
    private Set<OrderBill> orderBills = new HashSet<>();

}
