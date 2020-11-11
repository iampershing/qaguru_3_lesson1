import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

public class GoogleTests {

    @Test
    void selenideSearchInChrome() {
        Configuration.browser = "chrome";
        open("http://google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text("Selenide: concise UI tests in Java"));
    }

    @Test
    void selenideSearchInFirefox() {
        Configuration.browser = "firefox";
        open("http://google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $(byId("search")).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
