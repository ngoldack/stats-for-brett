package de.ngoldack.statsforbrett.models;

import java.util.ArrayList;
import java.util.HashMap;

public class VideogameMatch extends Match{
    // instance variables
    VideogamePlattform plattform;

    //constructor
    public VideogameMatch(int id, Game game, String location, ArrayList<User> players, HashMap<Integer, ArrayList> scoreboard, VideogamePlattform plattform){
        super(id, game, location, players, scoreboard);
        this.plattform = plattform;
    }


    //methods

}
