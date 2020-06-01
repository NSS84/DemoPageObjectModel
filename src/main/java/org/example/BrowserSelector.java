package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
    LoadProp loadprop = new LoadProp();
    String browser = loadprop.getProperty("browser");


    public void setupBrowser() {

        System.out.println("We are using ------>>>>>>>"+browser+" browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else
            System.out.println("Invalid browser name"+browser);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    }

    public void closeBrowser()
    {
        driver.quit();
    }
}