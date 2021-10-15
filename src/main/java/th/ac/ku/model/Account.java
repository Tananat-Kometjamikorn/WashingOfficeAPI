package th.ac.ku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class Account {
    @Id
    private String username;
    private String password;
    private String name;
}
