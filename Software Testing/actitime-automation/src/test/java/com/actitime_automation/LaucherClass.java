package com.actitime_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaucherClass {

    public static void main(String[] args) {

        //1. create browser instance
        WebDriver driver = new ChromeDriver();
        // 2. launch browser instance
        driver.get("https://flipkart.com/");
    }
}
