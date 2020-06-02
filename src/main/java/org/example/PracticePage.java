package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticePage extends Utils{
    private By _clickLogo=By.cssSelector("[src=\"images/rs_logo.png\"]");

     WebElement radio1;
     WebElement radio2;
    private By _clickRadiobutton1=By.cssSelector("[value=\"radio1\"]");
    private By _clickRadiobutton2=By.cssSelector("[value=\"radio2\"]");

    WebElement option1;
    WebElement option2;
    WebElement option3;
    private By _clickCheckbox1=By.cssSelector("#checkBoxOption1");
    private By _clickCheckbox2=By.cssSelector("#checkBoxOption2");
    private By _clickCheckbox3=By.cssSelector("#checkBoxOption3");




    public void verifyUserIsOnPracticePage()
    {
     assertURL("AutomationPractice/");
    }

    public void ClickOnRahulShettyLogo()
    {
        clickOnElement(_clickLogo);

    }

    public void clickOnRadioButton1()
    {
        radio1=driver.findElement(_clickRadiobutton1);
        radio1.click();
    }

    public void verifyRadioButton1IsClicked()
    {
        if(radio1.isSelected())
        {
            System.out.println("Radio1 is selected");
        }
        else
            System.out.println("Radio1 is not selected");
    }

    public void clickOnRadioButton2()
    {
        radio2=driver.findElement(_clickRadiobutton2);
        radio2.click();
    }

    public void verifyRadioButton2IsClicked()
    {
        if(radio2.isSelected())
        {
            System.out.println("Radio2 is selected");
        }
        else
            System.out.println("Radio2 is not selected");
    }

    public void clickOnCheckbox1()
    {
        option1=driver.findElement(_clickCheckbox1);
        option1.click();
    }
    public void verifyCheckbox1IsToggledOn()
    {
        if(option1.isSelected())
            System.out.println("Option 1 is toggled on");
        else
            System.out.println("Option 1 is toggled off");
    }

    public void clickOnCheckbox2()
    {
        option2=driver.findElement(_clickCheckbox2);
        option2.click();
    }
    public void verifyCheckbox2IsToggledOn()
    {
        if(option2.isSelected())
            System.out.println("Option 2 is toggled on");
        else
            System.out.println("Option 2 is toggled off");
    }
    public void deSelectCheckbox1()
    {
        option1.click();
        if(!option1.isSelected())
        {
            System.out.println("Now Option1 is toggled off");
        }

    }


}
