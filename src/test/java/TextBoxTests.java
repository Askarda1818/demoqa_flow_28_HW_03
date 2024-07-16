import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Smit");
        $("#userEmail").setValue("Smit@mail.ru");
        $("#currentAddress").setValue(" Street Puchkina, 12/2");
        $("#permanentAddress").setValue("Sity Baksan");
        $("#submit").click();
        $("").shouldHave(text("https://selenide.org"));
    }
}
