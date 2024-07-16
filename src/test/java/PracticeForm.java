import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    @BeforeAll
    static  void beforeAll(){
        Configuration.browserSize="1928x1080";
        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;

    }
    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Aslan");
        $("#lastName").setValue("Kardanov");
        $("#userEmail").setValue("Askarda@test.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("89280000000");
        $("#dateOfBirthInput").click();
        $(by("aria-label","Choose Friday, July 19th, 2024")).click();
        $("#subjectsInput").setValue("Commerce").pressEnter();
        //$("#subjectsContainer").setValue("English");

        /*$("#permanentAddress").setValue("Sity Baksan");
        $("#submit").click();
        $("#output #name").shouldHave(text("Smit"));
        $("#output #email").shouldHave(text("Smit@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Street Pushkina, 12/2"));
        $("#output #permanentAddress").shouldHave(text("Sity Baksan"));*/
    }
}
