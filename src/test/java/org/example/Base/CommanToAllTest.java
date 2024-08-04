package org.example.Base;

import org.example.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommanToAllTest {

    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start

    @BeforeMethod
    public void setup(){
        DriverManager.init();
//        DriverManagerSelenoid.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
//        DriverManagerSelenoid.down();
    }
}
