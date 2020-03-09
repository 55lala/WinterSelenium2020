package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
        Select selectSimpleDropdown = new Select(simpleDropdown);
        selectSimpleDropdown.selectByVisibleText("Option 2");
        BrowserUtils.wait(3);
        selectSimpleDropdown.selectByVisibleText("Option 1");
        BrowserUtils.wait(3);

        Select selectYear=new Select(driver.findElement(By.id("year")));
        Select selectMonth=new Select(driver.findElement(By.id("month")));
        Select selectDay=new Select(driver.findElement(By.id("day")));

        selectYear.selectByVisibleText("1993");
        selectMonth.selectByVisibleText("April");
        selectDay.selectByVisibleText("26");

        List<WebElement> months=selectMonth.getOptions();
        for(WebElement month: months){

            String monthName = month.getText();
            selectMonth.selectByVisibleText(monthName);
            BrowserUtils.wait(2);

        }
        BrowserUtils.wait(5);
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("District of Columbia");
        String selected = stateSelect.getFirstSelectedOption().getText();

        if(selected.equals("District of Columbia")) {
            System.out.println("Tessst passeddd");
        }else{
            System.out.println("tessst faillledddd");
        }



        BrowserUtils.wait(4);
        driver.quit();
    }
}
