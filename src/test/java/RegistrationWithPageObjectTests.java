import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrarionPage;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static pages.RegistrarionPage.*;

public class RegistrationWithPageObjectTests {

    RegistrarionPage registrarionPage = new RegistrarionPage();
    @BeforeAll
    static  void beforeAll(){
        Configuration.browserSize="1928x1080";
        Configuration.browser = "Chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
    }
    @AfterAll
    static  void afterAll(){
        closeWebDriver();
    }
    @Test
    void practiceFormTest() {
       registrarionPage.openPage()
               .setFirstName("Aslan")
               .setlastName("Kardanov")
               .setUserEmail("Askarda@test.com")
               .setGenterWrapper("Other")
               .setUserNumber("89280000000")
               .setDateOfBirth("24","September","2024")
               .setSubjects("Commerce")
               .setHobbiesWrapper("Sports")
               .setUploadPicture("src/test/resources/Toka.png")
               .setCurrentAddress("Kabardino_Balkaria, Baksan")
               .setState("NCR")
               .setCity("Noida")
               .setSubmitClick();

        registrarionPage.checkResult("Student Name", "Aslan Kardanov")
                        .checkResult("Student Email", "Askarda@test.com");

    }
}
