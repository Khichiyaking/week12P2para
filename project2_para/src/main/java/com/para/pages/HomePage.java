package com.para.pages;

import com.para.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        Reporter.log("Click on Login Link" +loginLink.toString()+"<br>");
        clickOnElement(loginLink);
    }


}
