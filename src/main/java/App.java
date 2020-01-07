


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import models.Hero;
import models.Squad;

import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String [] args){
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
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
            int max_number = Integer.parseInt(request.queryParams("number"));
            Squad newSquad = new Squad(squadName);
            newSquad.setCause(cause);
            newSquad.setMax_number(max_number);
            model.put("squadName", squadName);
            model.put("cause", cause);
            model.put("max_number", max_number);
            return new ModelAndView(model, "successSquad.hbs");
        }, new HandlebarsTemplateEngine());

        //show add heroes page
        post("/addHero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String squadId = request.queryParams("squads");
            String heroName = request.queryParams("hero");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int age = Integer.parseInt(request.queryParams("age"));
            Hero newHero = new Hero(heroName, power, age,weakness);
            ArrayList<Hero> allHeroes = Hero.getAllHeroes();
            ArrayList<Squad> allSquads = Squad.getAllSquads();
//            Squad newSquad = Squad.findSquad(Integer.parseInt(squadId));
//            newSquad.addHeroToSquad(newHero);
            model.put("heroName", heroName);
            model.put("power", power);
            model.put("weakness", weakness);
            model.put("age", age);
            model.put("allHeroes", allHeroes);
            model.put("allSquads", allSquads);
            model.put("squadId", squadId);
//            model.put("newSquad", newSquad);
            return new ModelAndView(model, "successHero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/addHeroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
