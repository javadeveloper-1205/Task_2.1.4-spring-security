package web.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

//    @ManyToMany
//    @JoinTable(
//
//    )

}
