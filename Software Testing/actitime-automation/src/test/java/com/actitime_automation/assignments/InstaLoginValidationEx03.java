/*
    Assingment question on instagram login validation test automation.
*/
package com.actitime_automation.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginValidationEx03 {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.instagram.com/accounts/login/";
        driver.get(url);

        Thread.sleep(5000);

        WebElement button = driver.findElement(By.xpath("//div[text()='Log in']/parent::button"));

        if(button.isDisplayed()){
            if(button.isEnabled()){
                button.click();
            }else {
                throw new Exception("Button is disabled!!");
            }
        }else {
            Thread.sleep(5000);
            if (button.isEnabled()) {
                button.click();
            } else {
                throw new Exception("Button is disabled!!");
            }
        }

    }

}