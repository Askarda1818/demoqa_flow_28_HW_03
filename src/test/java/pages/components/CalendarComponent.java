package pages.components;

import pages.RegistrarionPage;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        $(".react-datapicer__mont-select").selectOption("September");
        $(".react-datapicer__year-select").selectOption("2024");
        $(".react-datepicker__day--024:not(.react-datepicker__day--outside-month)").click();

    }
}
