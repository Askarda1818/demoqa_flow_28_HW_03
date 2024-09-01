import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class NewGithubTest_02 {
    @Test
    void  RunTestOne(){
       // Configuration.browserSize="800x400";
        open("https://github.com/search?q=selenide&type=repositories");
        $("a[href='/selenide/selenide']").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$("ul li").hover();

                // closest()  подняться вверх
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
