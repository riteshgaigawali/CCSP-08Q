/*
    Assingment question on hackerrank login validation test automation.
*/
package com.actitime_automation.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRankValidationTestEx05 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hackerrank.com/auth/login";
        driver.get(url);

        Thread.sleep(5000);

        WebElement button = driver.findElement(By.xpath("//button[text()='Log In']"));

        //TODO : ASK THIS DOUBT TO SIR

        if(button.isDisplayed()){
            System.out.println("log : Inside if condition.");
            button.click();
        }else{
            System.out.println("log : Button not displayed yet wait a while.....!!");
            Thread.sleep(5000);
            button.click();
        }

    }
}
