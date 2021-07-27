package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
* To avoid submitting form verified that send button is enabled
 * once user completes the contact form
 */
public class TC_VerifyContact extends Base {

    private static final Logger log = LogManager.getLogger(TC_VerifyContact.class.getName());

    @Test
    public void verifyContactForm() {
        homePage.clickContactBtn();
        String name = "test";
        String phone = "11233211212";
        String msg = "testing";
        homePage.setTxtContactName(name);
        homePage.setTxtContactPhone(phone);
        homePage.setTxtContactMsg(msg);
        if (homePage.getSendBtn().isEnabled()) {
            log.info("The Button is working as expected");
            Assert.assertTrue(true);
        } else {
            log.warn("The Button is not working as expected");
            Assert.fail();
        }
    }

}
