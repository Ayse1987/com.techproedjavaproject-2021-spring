package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day02_FirefoxBrowserDemo {
    public static void main(String[] args) {
        /*
        Create a new class under : FirefoxBrowserDemo Create main method
*/
        //Set Path
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\geckodriver.exe");
        //Create gecko driver
        WebDriver driver =new FirefoxDriver();//WebDriver API
        //Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        // Maximize the window
        driver.manage().window().maximize();
        // Close/Quit the browser
        driver.quit();

    }
}
