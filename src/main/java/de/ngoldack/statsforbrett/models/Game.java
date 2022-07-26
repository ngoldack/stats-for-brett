package de.ngoldack.statsforbrett.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URI;

@Data
public abstract class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "min_player_count")
    private int minPlayerCount;
    @Column(name = "max_player_count")
    private int maxPlayerCount;
    @Column(name = "avg_playtime")
    private int avgPlaytime;
    @Column(name = "poster_uri")
    private URI posterURI;

    protected Game() {
    }
}
