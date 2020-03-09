package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NoSElectDropdown {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        BrowserUtils.wait(5);
        driver.findElement(By.id("dropdownMenuLink")).click();

        BrowserUtils.wait(5);

        List<WebElement> allLinks = (List<WebElement>) driver.findElement(By.className("dropdown-item"));
        for(WebElement link: allLinks) {
            System.out.println(link.getText() + " : " + link.getAttribute("href"));
        }


        }
    }

