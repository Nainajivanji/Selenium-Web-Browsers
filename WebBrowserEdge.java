package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowserEdge {
    public static void main(String[] args) {

//        1. Set up the Edge driver
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Driver\\msedgedriver.exe");
//        2.Create an instance of WebDriver
        WebDriver driver = new EdgeDriver();
//        3.Navigate to the webpage
        driver.get("https://tesco.com/");
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
    }
}