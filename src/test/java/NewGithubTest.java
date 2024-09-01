import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NewGithubTest {

    @Test
    void shouldFindSelenideTest(){
        open("https://github.com");
        $(".flex-1").$(byText("Search or jump to...")).setValue("selenide").pressEnter();


    }
}
