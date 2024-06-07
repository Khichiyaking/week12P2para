package com.para.pages;

import com.para.utility.Utility;
import org.openqa.selenium.By;

public class LoginTest extends Utility {

    By uname = By.xpath("//input[@name='username']");

    By pass = By.xpath("//input[@name='password']");

    By loginbutton = By.xpath("//div/input[@type='submit']");


    public void enteruname(String uname1) {
        sendTextToElement(uname, uname1);
    }

    public void enterpass(String pass1) {
        sendTextToElement(pass, pass1);
    }

    public void loginclick() {
        clickOnElement(loginbutton);
    }


    public void loginform() {
        enteruname("dhavalpp");
        enterpass("Dhaval1234");
        loginclick();


    }
}
