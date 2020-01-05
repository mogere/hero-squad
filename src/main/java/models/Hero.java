package models;

public class Hero {

    private String name;
    private String power;
    private int age;
    private String weakness;

    public Hero(){

    }
    public Hero(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


}
