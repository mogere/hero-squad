package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private String cause;
    private int id;
    private static ArrayList<Squad> allSquads = new ArrayList<>();
    private List<Hero> heroes;


    public Squad(String name){
        this.squadName = name;
        allSquads.add(this);
        this.id = allSquads.size();
    }

    public String getCause(){
        return cause;
    }
    public void setCause(String cause){
        this.cause = cause;
    }

    public void addHeroToSquad(Hero hero){
        heroes.add(hero);
    }

    public static ArrayList<Squad> getAllSquads() {
        return allSquads;
    }

    public List<Hero> getAllHeroes(){
        return heroes;
    }
}
