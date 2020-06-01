package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils {
    private By _myCourses=By.cssSelector("a[href$=\"enrolled\"]");

    public void verifyUserRegisteredSuccessfully()
    {

        Assert.assertEquals("My Courses",getTextFromElement(_myCourses));
    }

}
