package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrarionPage {
    private SelenideElement  firstNameInput = $("#firstName"),
      lastNameInput = $("#lastName"),
            userEmailInput=$("#userEmail"),
            genterWrapperInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput");
     CalendarComponent calendarComponent = new CalendarComponent();

    public RegistrarionPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return  this;
    }

    public  RegistrarionPage setFirstName(String value){
        firstNameInput.setValue(value);
        return  this;
    }
    public  RegistrarionPage setlastName(String value){
        lastNameInput.setValue(value);
        return  this;
    }
    public  RegistrarionPage setUserEmail(String value){
        userEmailInput.setValue(value);
        return  this;
    }
    public  RegistrarionPage setGenterWrapper(String value){
        genterWrapperInput.$(byText(value));
        return  this;
    }
    public  RegistrarionPage setUserNumber(String value){
        userNumberInput.setValue(value);
        return  this;
    }

    public  RegistrarionPage setDateOfBirth(String day, String month, String year){
        calendarInput.click();
        calendarComponent.setDate(day,month,year);
        return  this;
    }

    public  RegistrarionPage checkResult(String key, String value){
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
        return  this;
    }


}
