package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPage {
    private WebDriver driver;


    By txtDemoEmail = By.cssSelector("input[id='user-email']");
    By btnWatchDemo = By.xpath("//button[@class='cta-primary']");
    public DemoPage (WebDriver driver){
        this.driver =driver;
    }

    public boolean verifyEmail() {
         return driver.findElement(txtDemoEmail).isDisplayed();
    }

    public boolean verifyWatchBtn() {
        return driver.findElement(btnWatchDemo).isDisplayed();
    }



}
