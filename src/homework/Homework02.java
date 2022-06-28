package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {

    /*
    Go to http://automationpractice.com/index.php
    Click on Sign in link
    Enter you email (you can create a fake email and use that email)
    And click on Create an account link
    And Verify the CREATE AN ACCOUNT isDisplayed() on the page
    And Verify the YOUR PERSONAL INFORMATION isDisplayed() on the page
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
       WebElement signIn= driver.findElement(By.partialLinkText("Sign in"));
       System.out.println(signIn.getText());
       signIn.click();
       WebElement emailBox=driver.findElement(By.id("email_create"));
       emailBox.sendKeys("kaya@gmail.com");
       Thread.sleep(1000);

       WebElement CreateButton= driver.findElement(By.id("SubmitCreate"));
       CreateButton.click();
        Thread.sleep(1000);
        WebElement CreateAccountPage= driver.findElement(By.className("page-heading"));

        if(CreateAccountPage.isDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Create Account is not displayed ");
        }
        WebElement PersonalInfo=driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));

        if(PersonalInfo.isDisplayed()){
            System.out.println("PASS");
            System.out.println("Personal infi is displayed");
        }else{
            System.out.println("FAIL");
            System.out.println("personel info is not displayed");
        }

    }
}
