package de.ngoldack.statsforbrett.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "boardgames")
public class Boardgame extends Game {
    @Column(name = "boardgame_type")
    private BoardgameType boardgameType;
}
