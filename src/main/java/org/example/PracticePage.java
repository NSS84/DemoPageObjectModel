package org.example;

import org.openqa.selenium.By;

public class PracticePage extends Utils{
    private By _clickLogo=By.cssSelector("[src=\"images/rs_logo.png\"]");

    public void verifyUserIsOnPracticePage()
    {
     assertURL("AutomationPractice/");
    }

    public void ClickOnRahulShettyLogo()
    {
        clickOnElement(_clickLogo);

    }
}
