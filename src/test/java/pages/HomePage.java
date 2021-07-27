package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {

    private WebDriver driver;

    By lnkLogin = By.linkText("Login");
    By btnWatchDemo = By.cssSelector("a[href*='/demo']");
    By mnuHome = By.className("menu-left");
    By lnkPricing = By.linkText("Pricing");
    By btnContact = By.xpath("//button[@class='ContactBubble__Bubble']");
    By links = By.tagName("a");
    By txtContactName = By.xpath("//input[@id='Name']");
    By txtContactPhone = By.cssSelector("input[type='tel']");
    By txtContactMsg = By.xpath("//textarea[@id='Message']");
    By btnSubmitContact = By.xpath("//button[@type='submit']");
    private String iframeContact = "podium-bubble";
    private String iframeModal = "podium-modal";
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogin() {
        driver.findElement(lnkLogin).click();
        return new LoginPage(driver);
    }

    public DemoPage clickWatchDemo() {
        driver.findElement(btnWatchDemo).click();
        return new DemoPage(driver);

    }

public void setTxtContactName(String name){
        driver.findElement(txtContactName).sendKeys(name);
}
    public void setTxtContactPhone(String phone){
        driver.findElement(txtContactPhone).sendKeys(phone);
    }
    public void setTxtContactMsg(String msg){
        driver.findElement(txtContactMsg).click();
        driver.findElement(txtContactMsg).sendKeys(msg);
    }
    public WebElement getSendBtn(){
        return driver.findElement(btnSubmitContact);
    }

    public List<String> getMenuItems() {
        List<WebElement> ele = driver.findElements(mnuHome);
        List<String> menuItems  = new ArrayList<>();
        for (int i = 0; i < ele.size() ; i++) {
            String item = ele.get(i).getText();
            menuItems.add(item);
        }
        return menuItems;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickContactBtn() {
        driver.switchTo().frame(iframeContact);
        driver.findElement(btnContact).click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame(iframeModal);

    }

    public List<String> getAllLinks() {
        List<String> allLinks = new ArrayList<>();
        List<WebElement> elements = driver.findElements(links);

        for (int i = 0; i < elements.size(); i++) {
            String lnk = elements.get(i).getAttribute("href");
            allLinks.add(lnk);

        }
        return allLinks;
    }



        public PricingPage clickPricing(){
        driver.findElement(lnkPricing).click();
        return new PricingPage(driver);
    }




}
