package de.ngoldack.statsforbrett.models;

public class Boardgame extends Game {
    //instances
    /**
     * type of boardgame
     * Base game or extension
     */
    private final BoardgameType boardgameType;

    //constructor
    public Boardgame(String id, String name, String publisher, int minPlayerCount, int maxPlayerCount, String posterURI, BoardgameType boardgameType){
        super(id, name, publisher, minPlayerCount, maxPlayerCount, posterURI);
        this.boardgameType = boardgameType;
    }
    /**
     * constructor for the case that an instance is required without knowing anything about the game yet
     */
    public Boardgame(String id){
        this(id, "defaultname", "defaultpublisher", 0, 0, "noURI", BoardgameType.UNKNOWN);
    }

    /**
     * constructor for the case that only the name is known
     * @param id
     * @param name
     */
    public Boardgame(String id, String name){
        this(id, name, "defaultpublisher", 0, 0, "noURI", BoardgameType.UNKNOWN);
    }

    //methods
}
