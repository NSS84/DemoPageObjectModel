package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink=By.cssSelector("[class=\"theme-btn register-btn\"]");

    public void verifyUserIsOnHomePage()
    {
        assertURL("/index");
    }

    public void clickOnRegister()
    {
        clickOnElement(_registerLink);
    }
}
