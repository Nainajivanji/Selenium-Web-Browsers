package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebBrowserFirefox {
    public static void main(String[] args) {
        //using the exception code try/catch is resulting in less error
        try {
//       1. Set up the Firefox driver
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");

//       2.Create an instance of WebDriver
        WebDriver driver = new FirefoxDriver();
//        3.Navigate to the webpage
        driver.get("https://www.bmstores.co.uk/");
//        4. Get Page Title

        String PageTitle = driver.getTitle();
        System.out.println("Page Title is: " + PageTitle);
//        5. Navigate back
        driver.navigate().back();
//        6. Navigate forward
        driver.navigate().forward();
//        7. Refresh
        driver.navigate().refresh();
//        8. Maximize the window
        driver.manage().window().maximize();
//        9.Get Current URL
        System.out.println("Current Url is: " + driver.getCurrentUrl());
//        10.Close the browser.
        driver.close();
//        11.Quit (closes all open browsers)
        driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


