package de.ngoldack.statsforbrett.models;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    //instance variables
    private int id;
    private Date date;
    private String location;
    private ArrayList<User> players;
    private ArrayList<Match> matches;


    //constructor
    public Event(int id,String location;  ArrayList<User> players, ArrayList<Match> matches){
        this.id = id;
        this.location = location;
        this.date = new Date();     //gets current time and date
        this.players = players;
        this.matches = matches;
    }

    //methods
    public ArrayList<Match> getMatches(){
        return this.matches;
    }
}
