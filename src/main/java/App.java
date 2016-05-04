import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("word", request.session().attribute("word"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String userInput = request.queryParams("word");
      request.session().attribute("word", userInput);
      model.put("word", userInput);

      VowelReplace newVowelReplace = new VowelReplace();
      String results = newVowelReplace.runVowelReplace(userInput);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/guess", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/guess.vtl");
      request.session().attribute("word");

      String userGuess = request.queryParams("userGuess");
      // String original = request.session().attribute("word");

      model.put("userGuess", userGuess);
      model.put("word", request.session().attribute("word"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
