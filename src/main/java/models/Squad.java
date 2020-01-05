package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private String cause;
    private int id;
    private static ArrayList<Squad> allSquads = new ArrayList<>();


    public Squad(){

    }


    public static ArrayList<Squad> getAllSquads() {
        return allSquads;
    }
}
