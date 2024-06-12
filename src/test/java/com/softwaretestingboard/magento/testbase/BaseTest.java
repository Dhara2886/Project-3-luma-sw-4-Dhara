package com.softwaretestingboard.magento.testbase;

import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String Browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(Browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
