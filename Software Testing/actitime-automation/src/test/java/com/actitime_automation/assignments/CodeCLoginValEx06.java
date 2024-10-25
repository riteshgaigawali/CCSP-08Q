/* Assignment question on login page validation of codechef.  */
package com.actitime_automation.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeCLoginValEx06 {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.codechef.com/login";
        driver.get(url);

        Thread.sleep(5000);

        WebElement button = driver.findElement(By.xpath("//input[@id='edit-submit-button' and @value='Login']"));

        if(button.isDisplayed()){
            if(button.isEnabled()){
                button.click();
            }else{
                throw new Exception();
            }
        }else{
            Thread.sleep(5000);
            if(button.isEnabled()){
                button.click();
            }else{
                throw new Exception();
            }
        }

        Thread.sleep(5000);

        String userErr = driver.findElement(By.xpath("//label[text()='Username or Email: ']/following-sibling::div/descendant::div[3]")).getText();
        String passErr = driver.findElement(By.xpath("//label[text()='Password: ']/following-sibling::div/descendant::div[3]")).getText();

        if(userErr.equals("Username or Email field is required.")){
            System.out.println("Error message for username is valid!!");
        }else{
            System.out.println("Error message for username is invalid!");
        }

        if(passErr.equals("Password field is required.")){
            System.out.println("Error message for password is valid!!");
        }else{
            System.out.println("Error message for password is invalid!");
        }

        Thread.sleep(3000);
        driver.close();

    }


}
