import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Let's create a puzzle!");
  }

  @Test
  public void resultsTest() {
    goTo("http://localhost:4567/");
    fill("#inputWord").with("Appa");
    submit(".btn");
    assertThat(pageSource()).contains("-pp-");
  }

  @Test
  public void guessTest() {
    goTo("http://localhost:4567/");
    fill("#inputWord").with("Appa");
    submit(".btn");
    fill("#userGuess").with("Appa");
    submit(".btn");
    assertThat(pageSource()).contains("You are correct!");
  }

  @Test
  public void guessFailTest() {
    goTo("http://localhost:4567/");
    fill("#inputWord").with("Appa");
    submit(".btn");
    fill("#userGuess").with("Poopa");
    submit(".btn");
    assertThat(pageSource()).contains("Sorry, that is incorrect!");
  }
}
