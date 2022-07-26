package de.ngoldack.statsforbrett.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
public abstract class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "game")
    private Game game;
    @Column(name = "location")
    private String location;
    @Column(name = "players")
    private List<User> players;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
    private HashMap<Integer, List<User>> scoreboard;

    protected Match() {
    }
}
