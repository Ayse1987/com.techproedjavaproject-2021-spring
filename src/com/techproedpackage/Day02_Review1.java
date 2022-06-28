package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Review1 {

    /*
1.Create chrome driver. Maximize the window
2.Go to youtube and verify if page title is “youtube”, If not, print the correct title.
3.Verify if the page URL contains youtube if not, print the right url.
4.Then Navigate to https://www.amazon.com/
5.Navigate back to youtube
6.Refresh the page
7.Navigate forward to amazon
9.Then verify if page title includes “Amazon”, If not, print the correct title. 10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
11.Quit the browser
*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
       // 1.Create chrome driver. Maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2.Go to youtube(https://www.youtube.com/) and verify if page title is “youtube”, If not, print the correct title.
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);//Waits for 5 seconds(IF computer is slow it helps computer)
        String actualYoutubeTitle=driver.getTitle();
        String expectedYoutubeTitle="youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Youtube Title : "+actualYoutubeTitle+"\nExpected Youtube Title : "+expectedYoutubeTitle);
        }
//        3.Verify if the page URL contains youtube if not, print the right url.
        String actualYoutubeURL=driver.getCurrentUrl();
        String expectedYoutubeURL="youtube";
        if (actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("CORRECT URL : "+actualYoutubeURL);
        }
//        4.Then Navigate to https://www.amazon.com/  Use navigate to
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(5000);//Waits for 5 seconds
//        5.Navigate back to youtube
        driver.navigate().back();
        Thread.sleep(5000);//Waits for 5 seconds
//        6.Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);//Waits for 3 seconds
//        7.Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);//Waits for 3 seconds
//        9.Then verify if page title includes “Amazon”, If not, print the correct title.
        if(driver.getTitle().contains("Amazon")){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("Amazon Title : "+driver.getTitle());
        }
//        10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
        if (driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("AMAZON TITLE : "+driver.getCurrentUrl());
        }
//        11.Quit the browser
        driver.quit();
    }

}