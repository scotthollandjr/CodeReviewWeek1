import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void runVowelReplace_returnsString_String() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "";
    assertEquals(expected, testVowelReplace.runVowelReplace(""));
  }

  @Test
  public void runVowelReplace_replaceSingleletter_hyphen() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "-";
    assertEquals(expected, testVowelReplace.runVowelReplace("a"));
  }

  @Test
  public void runVowelReplace_replaceDoubleletter_hyphenhyphen() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "--";
    assertEquals(expected, testVowelReplace.runVowelReplace("ae"));
  }

  @Test
  public void runVowelReplace_replaceNonVowel_String() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "b";
    assertEquals(expected, testVowelReplace.runVowelReplace("b"));
  }

  @Test
  public void runVowelReplace_fullSentence_String() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "- h-p- - p-ss";
    assertEquals(expected, testVowelReplace.runVowelReplace("i hope i pass"));
  }

  @Test
  public void runVowelReplace_upperAndLower_String() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "----------";
    assertEquals(expected, testVowelReplace.runVowelReplace("aAeEiIoOuU"));
  }

  @Test
  public void runVowelReplace_SymbolsAsWell_String() {
    VowelReplace testVowelReplace = new VowelReplace();
    String expected = "--p-c && -d-s!";
    assertEquals(expected, testVowelReplace.runVowelReplace("-Epic && Odus!"));
  }
}
