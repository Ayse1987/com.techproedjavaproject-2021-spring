package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {

    /*
        1.Create a new class : Homework1
        2.Using ChromeDriver, Go to facebook and verify if page title is "facebook", If not, print the correct title.
        3.Verify if the page URL contains facebook if not, print the right url.
        4.Then Navigate to https://www.walmart.com/
        5.Verify if the walmart page title includes "Walmart.com"
        6.Navigate back to facebook
        7.Refresh the page
        9.Close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected title :"+expectedTitle);
            System.out.println("Actual Title  :"+actualTitle);
        }
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Url :"+ expectedUrl);
            System.out.println("Actual Url :"+actualUrl);
        }
        driver.navigate().to("https://www.walmart.com/");
        String expectedTitle1 ="Walmart.com";
        String actualTitle1= driver.getTitle();
        if(actualTitle1.contains(expectedTitle1)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("Actual Title  :"+actualTitle1);
            System.out.println("Expected Title  :"+expectedTitle1);
        }
        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();

    }

}
