package net.proselyte.springbootdemo.model;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private ROLE role;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
