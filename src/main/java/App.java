


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

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
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //add squad details
        post("/postSquadDetails", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squadName");
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(squadName);
            newSquad.setCause(cause);
            model.put("squadName", squadName);
            model.put("cause", cause);
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
