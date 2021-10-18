package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Branch extends Account {

    @OneToMany(mappedBy = "branch")
    private Set<OrderInfo> orderInfoSet = new HashSet<>();

}
