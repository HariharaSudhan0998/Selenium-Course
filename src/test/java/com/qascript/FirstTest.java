package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.geckodriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    //public void OpenBrowser()  {
        public static void main(String[] args) {
    	
    	
    	System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver =new FirefoxDriver();  
         driver.get("htttp://flogile.com");
        // driver.get("htttp://65.2.108.33:8080");
        //driver.get("http://seleniumhq.org/");	 
   }
       /* WebDriver driver;
       // System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver =new FirefoxDriver();
        //ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
       // driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google")); */
 //   }


}


