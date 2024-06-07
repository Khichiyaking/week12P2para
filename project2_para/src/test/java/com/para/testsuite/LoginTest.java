package com.para.testsuite;

import com.para.pages.Register;
import com.para.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    Register loginPage = new Register();

    com.para.pages.LoginTest loginTest = new com.para.pages.LoginTest();

    @Test
    public void loginform() {
        loginTest.loginform();
    }

}
