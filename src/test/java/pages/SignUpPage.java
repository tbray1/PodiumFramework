package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private WebDriver driver;

    By hdrSignup = By.xpath("//h1");

    public SignUpPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getHeader() {
        return driver.findElement(hdrSignup);
    }
}
