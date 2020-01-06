


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import models.Hero;
import models.Squad;

import static spark.Spark.*;

public class App {
    public static void main(String [] args){
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> allHeroes = Hero.getAllHeroes();
            ArrayList<Squad> allSquads = Squad.getAllSquads();
            model.put("allHeroes", allHeroes);
            model.put("allSquads", allSquads);
        return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //add squad details
        post("/postSquadDetails", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squad");
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(squadName);
            newSquad.setCause(cause);
            model.put("squadName", squadName);
            model.put("cause", cause);
            return new ModelAndView(model, "successSquad.hbs");
        }, new HandlebarsTemplateEngine());

        //show add heroes page
        post("/addHero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String heroName = request.queryParams("hero");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int age = Integer.parseInt(request.queryParams("age"));
            Hero newHero = new Hero(heroName, power, age,weakness);
            model.put("heroName", heroName);
            model.put("power", power);
            model.put("weakness", weakness);
            model.put("age", age);
            return new ModelAndView(model, "successHero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/addHeroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
