package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    private String power;
    private int age;
    private String weakness;
    private int id;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
