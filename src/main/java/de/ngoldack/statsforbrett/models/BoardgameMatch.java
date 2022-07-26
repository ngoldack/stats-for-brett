package de.ngoldack.statsforbrett.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "boardgame_matches")
public class BoardgameMatch extends Match {
    // instance variables
    private List<Boardgame> extensions;
}
