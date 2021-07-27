package tests;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {


    public static Logger log = LogManager.getLogger(Base.class.getName());

    public String baseURL = "https://www.podium.com/";
    private WebDriver driver;
    protected HomePage homePage;
    String host="localhost";
@BeforeTest
    public void setUp() throws MalformedURLException {


        if(System.getProperty("HUB_HOST") !=null ) {
         host = System.getProperty("HUB_HOST");
    }

        if (System.getProperty("BROWSER") !=null &&
                System.getProperty("BROWSER").equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();

                driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), options);

        }

    if (System.getProperty("BROWSER") !=null &&
            System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), options);

        }
    if(System.getProperty("BROWSER") == null){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


        log.info("Driver is initialized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(baseURL);
        homePage = new HomePage(driver);


    }


    @AfterTest
    public void tearDown() {


        driver.quit();
    }


}


