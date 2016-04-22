import java.util.Map;
import java.util.HashMap;

public class CodeReviewWeek1 {

  public String runCodeReview(String inputWords) {
    HashMap<String, String> vowelReplace = new HashMap<String, String>();
    vowelReplace.put("a", "-");
    vowelReplace.put("A", "-");
    vowelReplace.put("e", "-");
    vowelReplace.put("E", "-");
    vowelReplace.put("i", "-");
    vowelReplace.put("I", "-");
    vowelReplace.put("o", "-");
    vowelReplace.put("O", "-");
    vowelReplace.put("u", "-");
    vowelReplace.put("U", "-");

    String[] arrayWords = inputWords.split("");
    String puzzledString = new String();

    for (String letter : arrayWords) {
      puzzledString += vowelReplace.get(letter);
    } return puzzledString;
  }
}
