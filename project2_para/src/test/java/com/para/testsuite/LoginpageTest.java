package com.para.testsuite;

import com.para.pages.LoginTest;
import com.para.pages.Register;
import com.para.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginpageTest extends TestBase {

    //HomePage homePage = new HomePage();
    Register loginPage = new Register();

    LoginTest loginTest = new LoginTest();

    @Test
    public void regform1() {
        loginPage.registerform();
    }
}
