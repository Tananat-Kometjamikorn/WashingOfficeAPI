package th.ac.ku.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HeadQuarter {

    @Id
    private String h_username;
    private String h_password;
    private String h_name;

}
