import java.util.Map;
import java.util.HashMap;

public class VowelReplace {

  public String runVowelReplace(String word) {
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

    String[] arrayWords = word.split("");
    String puzzledString = new String();

    for (String letter : arrayWords) {
      if (vowelReplace.get(letter) != null) {
      puzzledString += vowelReplace.get(letter);
    } else {
      puzzledString += letter;
    }
  } return puzzledString;
}
}
