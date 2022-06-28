package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    //This is our first Java Automation Class
    //1. Create main method in JAVA class

    //main->main method
    public static void main(String[] args) {
        //2.System.setProperty("DRIVER TYPE","DRIVER PATH")
        //DRIVER TYPE FOR CHROME: webdriver.chrome.driver
        //DRIVER PATH: /Users/techproed/Documents/seleniumdependencies/drivers/chromedriver"
        //WINDOWS USER : use chromedriver.exe EXTENSION
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");

        //3.Create WebDriver object
        WebDriver driver=new ChromeDriver();
        //NOTE: if selenium libraries are not imported then import them once

        //STEP 1,2,3 are mandatory for java automation framework in every class
        //NOTE: when we learn maven, we will not follow these steps. It will be shorter

        //4.Now that we are one with set up, we acan write automation script
        driver.get("https://www.google.com");

    }
}
