/*
    # WebElement(I) Methods :-

        1) sendKeys(String str) :
            - This method mainly used for entering the text on the provided web-element.
            - The sendKeys() method requires only String type of parameter.

        2) click() :
            - This method is used for performing click operation on provided web-element.
*/
package com.actitime_automation.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginTestEx02 {
    public static void main(String[] args) throws InterruptedException {

        // 1. create browser instance
        WebDriver driver = new ChromeDriver();
        // 2. launch browser instance with the url
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        // Wait for loading the web-page to locate the web-elements
        Thread.sleep(5000);

        // 3. find elements and send data to the elements
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        // 4. Click login button element
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

    }
}
