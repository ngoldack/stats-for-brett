package de.ngoldack.statsforbrett.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public abstract class Match {
    // instance variables
    private int id;
    private Game game;
    private String location;
    private ArrayList<User> players;
    private Date startTime;
    private Date endTime;
    private HashMap<Integer, ArrayList> scoreboard;


    //constructor
    public Match(int id, Game game, String location, ArrayList<User> players, HashMap<Integer, ArrayList> scoreboard){
        this.id = id;
        this.game = game;
        this.location = location;
        this.players = players;
        this.scoreboard = new HashMap<>(scoreboard);
    }


    //methods
    public Date getDuration(){
        //return this.endTime - this.startTime;
    }

    public ArrayList<User> getWinners(){
        ArrayList<User> winners = new ArrayList<User>();
        //To Do


        return winners;
    }
}
