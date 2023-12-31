package com.tutorialsninjademo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninjademo.customlisteners.CustomListeners;
import com.tutorialsninjademo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LogoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logoutText;

    public String getTextFromLogout() {
        Reporter.log("Getting logout text " + logoutText.toString());
        CustomListeners.test.log(Status.PASS, "Get logout text");
        return getTextFromElement(logoutText);
    }
}
