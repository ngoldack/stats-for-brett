package de.ngoldack.statsforbrett.models;

import java.util.ArrayList;

public class User {
    //instance variables
   private String username;
   private String password;
   private String email;

   private ArrayList<Game> library = new ArrayList<Game>();

   //constructor
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //methods

    /**
     * adds a new game to the user's library
     * @param game
     */
    public void addNewGameToLibrary(Game game){
        this.library.add(game);
    }

    /**
     * removes given game from user's library
     * @param game
     */
    public void deleteGameFromLibrary(Game game){
        this.library.remove(game);
    }

    public ArrayList<Game> getLibrary(){
        return this.library;
    }
}
