package com.qascript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class FirstTest {


    
    public static void main(String[] args) {
    	
    	
    	System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver =new FirefoxDriver();   
        driver.get("http:flogile.com");
        //driver.get("http://seleniumhq.org/");	 
   }

}
/*public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
         options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
       // driver.get("http://flogile.com");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}*/

