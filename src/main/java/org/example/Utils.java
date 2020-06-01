package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    public static void takeScreenshot(String filename)
    {
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scrFile,new File("src\\test\\Resources\\Screenshots\\"+filename+".jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Timestamp method for unique text
    public static String timeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        return(dateFormat.format(date));
    }

    //To get text from element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //Assert url method
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //Click on element
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //To enter text
    public void enterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //For explicit wait
    public void explicitWait(int time)
    {
        WebDriverWait wait=new WebDriverWait(driver,time);
    }

    //for Time delay
    public static void timeDelay(int time){
        try {
            Thread.sleep(time *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
