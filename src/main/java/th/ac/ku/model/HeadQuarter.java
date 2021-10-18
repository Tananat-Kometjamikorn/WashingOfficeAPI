package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class HeadQuarter extends Account{

    @OneToMany(mappedBy = "headQuarter")
    private Set<OrderBill> orderBillSet = new HashSet<>();

}
