/*
  Assignment question on login test for GitHub login page.
*/
package com.actitime_automation.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLoginTestEx02 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://github.com/login";
        driver.get(url);

        Thread.sleep(5000);

        WebElement username = driver.findElement(By.name("login"));
        username.sendKeys("your_user_name");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("your_password");
        WebElement login = driver.findElement(By.name("commit"));
        login.click();

    }


}
