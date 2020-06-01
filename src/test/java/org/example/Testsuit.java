package org.example;

import org.testng.annotations.Test;

public class Testsuit extends BaseTest{
    PracticePage practicePage=new PracticePage();
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationResultPage registrationResultPage=new RegistrationResultPage();

    @Test
    public void RegisterOnRahulShettyAcadamy()
    {
     practicePage.verifyUserIsOnPracticePage();
     practicePage.ClickOnRahulShettyLogo();
     timeDelay(2);
     homePage.verifyUserIsOnHomePage();
     homePage.clickOnRegister();
     registrationPage.verifyUserIsOnRegistrationPage();
     registrationPage.userEntersRegistrationDetails();
     timeDelay(3);
     registrationResultPage.verifyUserRegisteredSuccessfully();



    }
}
