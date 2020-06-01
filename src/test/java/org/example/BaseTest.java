package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.setupBrowser();
    }

    @AfterMethod
    public void closeBrowser(ITestResult result)

    {
     if(!result.isSuccess())
     {
         takeScreenshot(result.getName()+timeStamp());

     }
     browserSelector.closeBrowser();
    }
}
