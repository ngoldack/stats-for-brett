package de.ngoldack.statsforbrett.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity(name = "videogames")
public class Videogame extends Game {
    @Column(name = "videogame_plattform")
    private VideogamePlattform videogamePlattform;
}
