package de.ngoldack.statsforbrett.models;

public class Videogame extends Game{
    //instance variables
    VideogamePlattform videogamePlattform;

    //constructors
    public Videogame(String id, String name, String publisher, int minPlayerCount, int maxPlayerCount, String posterURI, VideogamePlattform videogamePlattform){
        super(id, name, publisher, minPlayerCount, maxPlayerCount, posterURI);
        this.videogamePlattform = videogamePlattform;
    }
    /**
     * constructor for the case that an instance is required without knowing anything about the game yet
     */
    public Videogame(String id){
        this(id, "defaultname", "defaultpublisher", 0, 0, "noURI", VideogamePlattform.UNKNOWN);
    }

    /**
     * constructor for the case that only the name is known
     * @param id
     * @param name
     */
    public Videogame(String id, String name){
        this(id, name, "defaultpublisher", 0, 0, "noURI", VideogamePlattform.UNKNOWN);
    }

    //methods


}
