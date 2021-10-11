package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Branch {
    @Id
    private String b_username;
    private String b_password;
    private String b_name;
    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderInfo> orderInfos;

}
