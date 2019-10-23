package Ozon2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WorkWithOzon {
    public static final String URL = "https://www.ozon.ru/";

    public static SelenideElement putCataloge() {
        return $(byText("Каталог"));
    }

    public static SelenideElement hoverSport() {
        return $(byText("Спортивные товары"));
    }

    public static SelenideElement putSnow() {
        return $(byText("Сноуборды и аксессуары"));
    }

    public static SelenideElement putSnoow() {
        return $(byText("Сноуборды"));
    }

    public static SelenideElement price() {
        return $(By.xpath("//input[@data-test-id='range-filter-from-input']"));
    }

    public static void closeCookie() {
        $(By.xpath("//button[@class='close']")).click();
    }

    public static SelenideElement levelPre() {
        return $(byText("Для прогрессирующих"));
    }

    public static SelenideElement local() {
        return $(By.xpath("//button[@class='d13f08']"));
    }

    public static SelenideElement textArea() {
        return $(By.xpath("//input[@autocomplete='off' and @autofocus='autofocus']"));
    }

    public static SelenideElement Izhevsk() {
        return $(byText("Ижевск, Удмуртская республика"));
    }

    public static SelenideElement Cart() {
        return $(By.xpath("//a[@href='/cart']"));
    }

    public static SelenideElement nameInCart() {
        return  $(By.xpath("//a[@class='title']/span"));
    }

}
