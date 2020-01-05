package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private String cause;
    private int id;
    private static ArrayList<Squad> allSquads = new ArrayList<>();


    public Squad(String name){
        this.squadName = name;
    }

    public String getCause(){
        return cause;
    }
    public void setCause(String cause){
        this.cause = cause;
    }

    public static ArrayList<Squad> getAllSquads() {
        return allSquads;
    }
}
