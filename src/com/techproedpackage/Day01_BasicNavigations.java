package com.techproedpackage;


    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class Day01_BasicNavigations {
        public static void main(String[] args) {
            //Step 1: setUp
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayse\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
            //Step 2:Create driver
            WebDriver driver = new ChromeDriver();
            //Step 3: We write the automation scrips

            //        Maximize the window
            driver.manage().window().maximize();
            // driver.manage().window().maximize();=> make the full screen
            //full screene goremez yoksa selenium-> onemli

//        Open google home page https://www.google.com/.
            driver.get("https://www.google.com/");
            //get("URL"); => takes to the URL

//        On the same class, Navigate to amazon home page https:// www.amazon.com/
            driver.navigate().to("https://www.amazon.com/");
            //navigate().to("URL") => takes to the URL

//        What is the differance between get() and navigate().to()  methods?
//        1. get() is shorter and more common
//        2. get() is a little faster
//        3. navigate() has more choice(to(), back(), forward(), refresh())
//        4. get("TYPE STRING") BUT navigate().to("TYPE URL")

//        Navigate back to google
            driver.navigate().back();
//        Navigate forward to amazon
            driver.navigate().forward();
            //Refresh the page
            driver.navigate().refresh();


//        Close/Quit the browser
            //driver.close(); => nearly same with quit() you can use one of them
//        close()=> close the current working browser
            driver.quit();
            //quit() will close ALL working browser. This will be stronger

    }
}
