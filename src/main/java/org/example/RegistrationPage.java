package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {



    private By _fullName=By.cssSelector("input#user_name");
    private By _emailAddress=By.cssSelector("[id=\"user_email\"]");
    private By _password=By.cssSelector("#user_password");
    private By _confirmPassword=By.cssSelector("#user_password_confirmation");
    private By _receivePromotionalEmails=By.cssSelector("#user_unsubscribe_from_marketing_emails");
    private By _agreeToTerms=By.cssSelector("input#user_agreed_to_terms");
    private By _signUp=By.cssSelector("[class*=\"signup-button\"]");

    public void verifyUserIsOnRegistrationPage()
    {
        assertURL("users/sign_up");
    }
    public void userEntersRegistrationDetails()
    {
        LoadProp loadprop=new LoadProp();

        String fullName=loadprop.getProperty("fullName");
        enterText(_fullName,fullName);


        enterText(_emailAddress,"abc123"+timeStamp()+"@gmail.com");

        String password=loadprop.getProperty("password");
        enterText(_password,password);

        String confirmPassword=loadprop.getProperty("confirmPassword");
        enterText(_confirmPassword,confirmPassword);

        clickOnElement(_receivePromotionalEmails);
        clickOnElement(_agreeToTerms);
        clickOnElement(_signUp);

    }


}
