package Ozon2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Product {
    public static ElementsCollection allProduct() {
        return $$(By.xpath("//a[@class='tile-wrapper']"));
    }

    public static String passForName = ".//span[@data-test-id='tile-name']";

    public static SelenideElement toCart() {
        return $(byText("В корзину"));
    }

}
