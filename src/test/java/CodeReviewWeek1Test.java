import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class CodeReviewWeek1Test {

  @Test
  public void runCodeReview_returnsString_String() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "";
    assertEquals(expected, testCodeReview.runCodeReview(""));
  }

  @Test
  public void runCodeReview_replaceSingleletter_hyphen() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "-";
    assertEquals(expected, testCodeReview.runCodeReview("a"));
  }

  @Test
  public void runCodeReview_replaceDoubleletter_hyphenhyphen() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "--";
    assertEquals(expected, testCodeReview.runCodeReview("ae"));
  }

  @Test
  public void runCodeReview_replaceNonVowel_String() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "b";
    assertEquals(expected, testCodeReview.runCodeReview("b"));
  }

  @Test
  public void runCodeReview_fullSentence_String() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "- h-p- - p-ss";
    assertEquals(expected, testCodeReview.runCodeReview("i hope i pass"));
  }

  @Test
  public void runCodeReview_upperAndLower_String() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "----------";
    assertEquals(expected, testCodeReview.runCodeReview("aAeEiIoOuU"));
  }

  @Test
  public void runCodeReview_SymbolsAsWell_String() {
    CodeReviewWeek1 testCodeReview = new CodeReviewWeek1();
    String expected = "-p-c && -d-s!";
    assertEquals(expected, testCodeReview.runCodeReview("Epic && Odus!"));
  }
}
