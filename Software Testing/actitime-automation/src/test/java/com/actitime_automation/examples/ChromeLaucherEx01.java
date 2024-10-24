/*
# Syntax to launch browser :
        - WebDriver driver = new ChromeDriver();

#WebDriver(I) Methods :-

   1) Navigate to given url :
        - driver.get("url");
   2) void close() :
        - The close() method of WebDriver interface is used for closing the currently focused window or tab.
   3) void quite() :
        - This method is used for closing all browser instances which are opened by driver variable.
   4) String getTitle() :
        - The getTitle() method of WebDriver interface returns a String containing the title of the web-page.
   5) String getCurrentUrl() :
        - This method of WebDriver interface returns the current page url in the String format.
*/
package com.actitime_automation.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaucherEx01 {

    public static void main(String[] args) {

        // 1. create browser instance
        WebDriver driver = new ChromeDriver();
        // 2. launch browser instance with the url
        driver.get("https://flipkart.com/");
        // 3. get the title of the web-page
        String title = driver.getTitle();
        System.out.println("Title :- "+title);
        // 4. get the current url of web-page opened by this instance
        String url = driver.getCurrentUrl();
        System.out.println("Currenly opened web-url :- "+url);
        // 5. close the current window/tab
        driver.close();
        // 6. close all the current window/tab
        //driver.quit();

    }
}
