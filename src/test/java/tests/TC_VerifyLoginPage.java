package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

/**
 * Verifying that user is able to successfully navigate to the Login Page
 */
public class TC_VerifyLoginPage extends Base {
    private static final Logger log = LogManager.getLogger(TC_VerifyLoginPage.class.getName());

    @Test
    public void verifyLogin() {
        LoginPage loginPage = homePage.clickLogin();
        if (loginPage.getEmail_Phone().isDisplayed()) {
            Assert.assertTrue(true);
            log.info("Navigated to login page successfully");
        } else {
            log.warn("Unable to navigate to login page");
            Assert.fail();
        }

    }

}
