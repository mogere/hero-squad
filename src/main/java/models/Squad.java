package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    String squadName;
    private String cause;
    int id;
    private static ArrayList<Squad> allSquads = new ArrayList<>();
    List<Hero> heroes;


    public Squad(String squadName){
        this.squadName = squadName;
        allSquads.add(this);
        this.id = allSquads.size();
    }

    public String getCause(){
        return cause;
    }

    public static Squad findSquad(int id){
        return allSquads.get(id-1);
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
