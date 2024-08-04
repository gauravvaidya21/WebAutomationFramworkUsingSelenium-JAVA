package org.example.Test;


import org.example.Base.CommanToAllTest;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.example.Pages.PageFactory.LoginPage_PF;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

import static org.example.Driver.DriverManager.driver;

public class TestVWOLogin_PF_DM extends CommanToAllTest {

    private static final Logger logger =  LogManager.getLogger(TestVWOLogin_PF_DM.class);

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {

        logger.info("Starting Test");
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);

        logger.info("Opening the URL");
        loginPage_PF.openVWOLoginURL("qa");

        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("Verifying the Result");

        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
