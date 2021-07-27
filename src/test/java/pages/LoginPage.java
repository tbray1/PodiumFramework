package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    By txtLoginEmail = By.cssSelector("input[id='emailOrPhoneInput']");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getEmail_Phone(){
        return driver.findElement(txtLoginEmail);

    }

}
