package Ozon2;
import Ozon2.WorkWithOzon;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    SelenideElement product;
    String nameOfProsuct;
    String nameOfProsuctInCart;

    @When("^open Ozon$")
    public void openOzon() {
        open(WorkWithOzon.URL);
    }

    @And("^click on Catalog$")
    public void clickOnCatalog() {
        WorkWithOzon.putCataloge().click();
    }

    @And("^hover Sport$")
    public void hoverSport() {
        WorkWithOzon.hoverSport().hover();
    }

    @And("^click on Snow$")
    public void clickOnSnow() {
        WorkWithOzon.putSnow().click();
    }

    @And("^click on Snoow$")
    public void clickOnSnoow() {
        WorkWithOzon.putSnoow().click();
    }

    @And("^click on price$")
    public void clickOnPrice() {
        WorkWithOzon.price().click();
    }

    @And("^waiting for check$")
    public void waitingForCheck() throws InterruptedException {
        Thread.sleep(10000);
    }

    @And("^clear price$")
    public void clearPrice() {
        WorkWithOzon.price().sendKeys(Keys.chord(Keys.CONTROL, "a"), "25000");
        WorkWithOzon.price().pressEnter();
    }

    @And("^delete cookie$")
    public void deleteCookie() {
        WorkWithOzon.closeCookie();
    }

    @And("^check Level Pre$")
    public void checkLevelPre() {
        WorkWithOzon.levelPre().click();
    }

    @And("^choose random snow$")
    public void chooseRandomSnow() {
        ElementsCollection products = Product.allProduct();
        product = products.get((int) (Math.random() * products.size()));
    }

    @Then("^sava name of product$")
    public void savaNameOfProduct() {
        nameOfProsuct = product.find(By.xpath(Product.passForName)).getText();
    }

    @And("^click on Cart$")
    public void clickOnCart() {
        Product.toCart().click();
    }

    @Then("^check that botton ToCart dis$")
    public void checkThatBottonToCartDis() {
        Assert.assertFalse("ras-ras", product.equals(Product.toCart()));
    }

    @And("^click on GeoLocal$")
    public void clickOnGeoLocal() {
        WorkWithOzon.local().click();
    }

    @And("^pass your city \"([^\"]*)\"$")
    public void passYourCity(String city) throws Throwable {
        WorkWithOzon.textArea().sendKeys(city);
        WorkWithOzon.Izhevsk().click();

    }

    @And("^go to Cart$")
    public void goToCart() {
        WorkWithOzon.Cart().click();
    }

    @Then("^check name of prosuct$")
    public void checkNameOfProsuct() {
        nameOfProsuctInCart = WorkWithOzon.nameInCart().getText();
        Assert.assertFalse("eto hardbas", nameOfProsuctInCart.equals(nameOfProsuct));
    }
}
