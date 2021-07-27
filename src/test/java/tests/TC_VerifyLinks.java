package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;

/**
 * Verifying that all of the links are working
 */

public class TC_VerifyLinks extends Base {
    private static final Logger log = LogManager.getLogger(TC_VerifyLinks.class.getName());


    @Test
    public void verifyLinks() {
        List<String> links = homePage.getAllLinks();

        for (String url : links) {
            if (url.isEmpty()) {
                continue;
            }
            HttpURLConnection huc;
            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.connect();
                if (huc.getResponseCode() <= 400 || huc.getResponseCode() == 999) {
                    Assert.assertTrue(true);
                    log.info(url + " is Working");
                } else {
                    Assert.fail();
                    log.warn(url + " Is Broken");
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }

}

