package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    private String power;
    private int age;
    private String weakness;
    private static ArrayList<Hero> allHeroes = new ArrayList<>();

    public Hero(){

    }
    public Hero(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public static ArrayList<Hero> getAllSquads() {
        return allHeroes;
    }

}
