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

}
