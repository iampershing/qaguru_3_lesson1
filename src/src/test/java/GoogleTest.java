import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    void selenideSearch() {
        open("http://google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(Condition.text("Selenide"));
    }
}
