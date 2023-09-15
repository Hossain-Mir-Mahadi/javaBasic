package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Web_Automation_Start {
    @Test
    public void LoadGoogleHomePage() throws InterruptedException{

        //open browser
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        WebDriver driver2 = new EdgeDriver();

        //browser google home page https://www.google.com/
        driver1.get("https://www.google.com/");


        //observe google home page
        Thread.sleep(5000);

        //Close browser
        driver1.quit();
    }
}
