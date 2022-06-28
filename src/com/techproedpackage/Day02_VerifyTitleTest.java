package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        //Step 1: setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //2.Navigate to homepage
        driver.get("https://www.google.com");

        //3.Verify(expected vs actual)if google titlw is "google"
        String expected= "google";
        String actual= driver.getTitle();//GOOGLE. GoGGle.googlE
        //getTitle();-> Returns the title of the page AS STRING
        //TESTERS DO NOT WRITE TEST TO PASS
        //TESTERS WRITE  A TEST TO CATCH A DEFECT OF BUG
        if(expected.equals(actual)){
            System.out.println("PASS");

        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL :"+actual);
            System.out.println("EXPECTED :"+expected);
        }
        //Note: Test case failed, so we found a bug.Google!=google
        //When we find a bug we follow the steps

        //wHAT DO OU DO WHEN YOU FIND A BUG???(INTERWIEV QUESTION)
        //1.Run the script again to make sure te test case is failing
        //2. Test the functionality to make sure
        //3.Communicate with BA(Writes AC)  or Dev,or PO(provides the acceptance criteria)doesnt know technical

        //4.Should I open a ticket if that is a bug?
        //Follow the company culture
        //some  companies we open ticket whenever we find a bug
        //sometimes it is a quick fix, so we talk to dev to fix it.
        //after confirming the bug, we can open ticket and assign to the developer.

        //5.What happens after dev fixed the bug?
        //Retest the application
        //Check te report
        //if pass, close the ticket
        //if failes again, DO NOT OPEN NEW TICKET . JUST DO NOT CLOSE THE EXISTING TICKET.

        //SPRINT: 2 weeks
        //What happens if the story is not finished in the sprint?
        //What happens if a bug cannot be fixed in the sprint?

        //This should not normally happen. This can rarely happen due to the bad planning
        //But if we cannot complete a user story, we usually move it to the next sprint
        //If the story is not clear, or or need to be refined again, then we move it to the backlog and refine again
    }
}
