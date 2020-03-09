package com.automation.tests.day4;


import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarmUp {
    static WebDriver driver;
    public static void main(String[]args) throws Exception{
        ebayTest();
        amazonTest();
       //// wikiTest();

       // Go to ebay
      //  enter search term
        //click on search button
       // print number of results


    }

   // private static void wikiTest() {



    private static void amazonTest() throws Exception{
        //go to amazon
      //  Go to ebay
        //enter search term
      //  click on search button
      //  verify title contains search term
        driver=DriverFactory.createDriver("chrome");
        driver.get("http://amazon.com");
        //driver.findElement((By.id("twotabsearchtextbox")).sendKeys("")

    }


    private static void ebayTest() throws Exception {
      //  Go to ebay
       // enter search term
       // click on search button
      //  print number of results
   driver= DriverFactory.createDriver("chrome");
   driver.get("http://ebay.com");
   driver.findElement((By.id("gh-ac"))).sendKeys("java book");
   driver.findElement(By.id("gh-btn")).click();
   WebElement searchResults=driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split("")[0]);
        Thread.sleep(3000);
        driver.quit();
    }

}

