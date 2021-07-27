package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingPage {
private WebDriver driver;
    By lblRequestQuote = By.className("quote-form__title");

    public PricingPage(WebDriver driver){
        this.driver = driver;
    }

    public String getQuote(){
        return driver.findElement(lblRequestQuote).getText();

    }
}
