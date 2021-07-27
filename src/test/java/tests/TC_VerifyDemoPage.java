package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoPage;

/**
 * Verify demo page elements without submitting the form
 */
public class TC_VerifyDemoPage extends Base {

    @Test
    public void verifyDemo() {

        DemoPage demoPage = homePage.clickWatchDemo();

        if (demoPage.verifyEmail() && demoPage.verifyWatchBtn()) {
            log.info("Successfully navigated to demo page");
            Assert.assertTrue(true);

        } else {
            Assert.fail();
            log.warn("Actual");
        }


    }
}
