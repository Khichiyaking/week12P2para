package com.para.testsuite;

import com.para.pages.HomePage;
import com.para.pages.Register;
import com.para.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    Register loginPage= new Register();



    @Test(dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
        homePage.clickOnLoginLink();
        //loginPage.loginToApplication(username,password);

    }
}
