package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Verifying that user is able to successfully navigate to Pricing page
 */
public class TC_VerifyPricingPage extends Base {
    private static final Logger log = LogManager.getLogger(TC_VerifyPricingPage.class.getName());

    @Test
    public void verifyPricingPage() {

        String expected = "Request a quote.";
        String actual = homePage.clickPricing().getQuote();

        if (actual.equalsIgnoreCase(expected)) {
            Assert.assertTrue(true);
            log.info("Successfully navigated to pricing page");
        } else {
            Assert.fail();
            log.warn("Unable to navigate to pricing page");
        }

    }
}
