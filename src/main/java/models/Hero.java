package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    String power;
    int age;
    String weakness;
    int id;
    private static ArrayList<Hero> allHeroes = new ArrayList<>();

    public Hero(String name, String power, int age, String weakness){
        this.name = name;
        this.power = power;
        this.age = age;
        this.weakness = weakness;
        this.id =  allHeroes.size();
        allHeroes.add(this);

    }

    public Hero(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public static ArrayList<Hero> getAllHeroes() {
        return allHeroes;
    }

}
