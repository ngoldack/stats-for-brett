package de.ngoldack.statsforbrett.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password")
    private String password; //TODO password encryption & spring security
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "library")
    private List<Game> library;

}
