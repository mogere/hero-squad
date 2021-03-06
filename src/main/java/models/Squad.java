package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private String cause;
    private int id;
    private int max_number;
    private static ArrayList<Squad> allSquads = new ArrayList<>();
    List<Hero> heroes;


    public Squad(String squadName){
        this.squadName = squadName;
        allSquads.add(this);
        heroes=new ArrayList<Hero>();
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
    public void setName(String name){
        this.squadName = name;
    }

    public void addHeroToSquad(Hero hero){
        if(id<max_number)
        heroes.add(hero);
    }

    public static ArrayList<Squad> getAllSquads() {
        return allSquads;
    }

    public List<Hero> getAllHeroes(){
        return heroes;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMax_number(int max_number) {
        this.max_number = max_number;
    }
}
