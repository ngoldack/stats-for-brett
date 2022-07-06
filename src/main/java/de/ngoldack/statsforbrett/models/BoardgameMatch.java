package de.ngoldack.statsforbrett.models;

import java.util.ArrayList;
import java.util.HashMap;

public class BoardgameMatch extends Match{
    // instance variables
    ArrayList<Boardgame> extensions;

    //constructor
    public BoardgameMatch(int id, Game game, String location, ArrayList<User> players, HashMap<Integer, ArrayList> scoreboard, ArrayList<Boardgame> extensions){
        super(id, game, location, players, scoreboard);
        this.extensions = extensions;
    }


    //methods

}
