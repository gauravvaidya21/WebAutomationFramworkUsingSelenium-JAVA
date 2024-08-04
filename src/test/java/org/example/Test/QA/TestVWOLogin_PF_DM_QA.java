package org.example.Test.QA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.example.Pages.PageFactory.LoginPage_PF;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.example.Driver.DriverManager.driver;

public class TestVWOLogin_PF_DM_QA {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM_QA.class);

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {
        logger.info("Starting Test in QA Environment");
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        logger.info("Opening the URL");
        loginPage_PF.openVWOLoginURL("qa");
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("Verifying the Result");
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");


        // AssertJ
        Assertions.assertThat(error_msg).isNotNull().isNotBlank();

        driver.quit();
    }
}
