package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(4);
        List<WebElement>checkBoxes=driver.findElements((By.tagName("input")));

        //if(checkBoxes.get(1).isDisplayed()&& checkBoxes.get(1).isEnabled()&&(!checkBoxes.get(1).isSelected())) {
        if(!checkBoxes.get(0).isSelected()&&checkBoxes.get(1).isSelected()){
            System.out.println("test passedddd");
        }else{
            System.out.println("test faileddd");
        }

       BrowserUtils.wait(2);

        WebElement checkbox1=checkBoxes.get(0);
        checkbox1.click();
        BrowserUtils.wait(2);
        if(checkbox1.isSelected()){
            System.out.println("test passeddd");
        }else{
            System.out.println("test faiiiledd");
            System.out.println("checkbox #1 is not selected!");
        }
        driver.quit();
      //  if(checkBoxes.get(1).isDisplayed()&& checkBoxes.get(1).isEnabled()&&(!checkBoxes.get(1).isSelected())) {
    }
}
