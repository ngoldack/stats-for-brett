package de.ngoldack.statsforbrett.models;

import java.net.URI;

public abstract class Game {
    //instances
    /**
     * the specific id of the game
     */
    private String id;

    /**
     * the specific name of the game
     */
    private String name;

    /**
     * the publisher of the game
     */
    private String publisher;

    /**
     * minimal amount of players required to play a match
     */
    private int minPlayerCount;

    /**
     * maximal amount of players allowed to play a match
     */
    private int maxPlayerCount;

    /**
     * the average playtime of a match
     * official value from publisher
     */
    private int avgPlaytime;

    /**
     * a poster of the game
     */
    private URI posterURI;

    //constructors

    /**
     * creates an instance of the Game class
     * used when all instance variables are known
     * @param id
     * @param name
     * @param publisher
     * @param minPlayerCount
     * @param maxPlayerCount
     * @param posterURI
     */
    protected Game(String id, String name, String publisher, int minPlayerCount, int maxPlayerCount, String posterURI){
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.minPlayerCount = minPlayerCount;
        this.maxPlayerCount = maxPlayerCount;
        this.posterURI = new URI(posterURI);
    }

    //methods
    //getters and setters
    public void setId(String Id) {
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }

    public void setMinPlayerCount(int minPlayerCount){
        this.minPlayerCount = minPlayerCount;
    }
    public int getMinPlayerCount(){
        return this.maxPlayerCount = maxPlayerCount;
    }

    public void setMaxPlayerCount(int maxPlayerCount){
        this.maxPlayerCount = maxPlayerCount;
    }
    public int getMaxPlayerCount(){
        return this.maxPlayerCount;
    }

    public void setAvgPlaytime(int avgPlaytime){
        this.avgPlaytime = avgPlaytime;
    }
    public int getAvgPlaytime(){
        return this.avgPlaytime;
    }

    //other methods
    public int realAvgPlaytime(){
        //TO DO
        return 0;
    }


}
