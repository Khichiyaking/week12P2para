package com.para.testbase;

import com.para.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    private com.para.propertyreader.PropertyReader PropertyReader;
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    //@Parameters("browser")
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        //closeBrowser();
    }
}
