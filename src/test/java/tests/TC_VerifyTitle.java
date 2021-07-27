package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Verify Website title is displayed correctly
 */
public class TC_VerifyTitle extends Base {
    private static final Logger log = LogManager.getLogger(TC_VerifyTitle.class.getName());

    @Test
    public void verifyTitle() {

        String expected = "Messaging Tools For Local Business - Podium";
        if (expected.equalsIgnoreCase(homePage.getTitle())) {
            Assert.assertTrue(true);
            log.info("Title is displaying correctly");
        } else {
            Assert.fail();
            log.warn("Title is displaying incorrectly");
        }

    }
}