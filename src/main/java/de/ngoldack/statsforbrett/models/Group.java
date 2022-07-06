package de.ngoldack.statsforbrett.models;

import java.util.ArrayList;

public class Group {
    //instance variables
    private int id;
    private String name;
    private ArrayList<User> members;
    private ArrayList<Event> events;


    //constructors


    //methods
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addMember(User new_member){
        this.members.add(new_member);
    }

    public void throwMemberOut(User unworthyMember){
        try {
            this.members.remove(unworthyMember);
        } catch (Exception e) {
            System.out.println("This is no current member of the group");
        }
    }

    public ArrayList<Game> getLibrary(){
        ArrayList<Game> library = new ArrayList<Game>();
        for (int i = 0; i < members.size(); i++) {
            for (int j = 0; j < members.get(i).getLibrary().size(); j++){
                library.add(members.get(i).getLibrary().get(j));
            }
        }
        return library;
    }

    public ArrayList<Match> getMatches(){
        ArrayList<Match> allMatches = new  ArrayList<Match>();
        for (int i = 0; i < events.size(); i++) {
            for (int j = 0; j < events.get(i).getMatches().size(); j++){
                allMatches.add(events.get(i).getMatches().get(j));
            }
        }
        return allMatches;
    }
}
