package de.ngoldack.statsforbrett.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity(name = "videogame_matches")
public class VideogameMatch extends Match {
    @Column(name = "plattform")
    private VideogamePlattform plattform;
}
