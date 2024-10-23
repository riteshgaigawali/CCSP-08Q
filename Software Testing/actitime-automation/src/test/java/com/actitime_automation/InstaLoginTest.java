package com.actitime_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginTest {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.instagram.com/accounts/login/";

        // 1. create browser instance
        WebDriver driver = new ChromeDriver();
        // 2. launch browser instance with the url
        driver.get(url);

        // Wait for loading the web-page to locate the web-elements
        Thread.sleep(5000);

        // 3. find elements and send data to the elements

        driver.findElement(By.name("username")).sendKeys("your_username");
        driver.findElement(By.name("password")).sendKeys("your_password");
        driver.findElement(By.xpath("//div[text()='Log in']/parent::button")).click();
    }


}
