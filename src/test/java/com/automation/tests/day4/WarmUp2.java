package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarmUp2 {
    static WebDriver driver;

    public static void main(String[] args) throws Exception{



        ebayTest();
        amazonTest();
        wikiTest();
        /*ebay:
        go to ebay--->driver.get("http://ebay.com");
        enter search term --->input.sendKeys("java book");
        click on search button --->searchButton.click();
        print number of results
        amazon:
        go to amazon
        enter search term
        click on search button
        verify title contains search term
        wiki:
        go to wikipedia.org
        enter search term selenium webdriver
        click on search button
        click on search result Selenium_(software)

         */

    }
    public static void ebayTest(){
        driver= DriverFactory.createDriver("chrome");
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResults=driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split("")[0]);

        driver.quit();
    }
    public static void amazonTest() {
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
        String title = driver.getTitle();
        if (title.contains("java book")) {
        System.out.println("testtt passeeeeddd");
    }else{
            System.out.println("tesssttt faillledd");

        }
        driver.quit();

    }
    public static void wikiTest() throws Exception{
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver",Keys.RETURN);

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Selenium (software")).click();
        Thread.sleep(3000);
        String link=driver.getCurrentUrl();
        if(link.endsWith("Selenium_(software)")) {
            System.out.println("tesssttt passeddd");
        }else{
            System.out.println("test failed");

        }
        driver.quit();
    }

}
