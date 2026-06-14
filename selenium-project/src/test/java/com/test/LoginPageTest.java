package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {

    @Test
    public void loginTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/konda/OneDrive/Desktop/sample/sample/login.html");

        driver.findElement(By.id("username"))
                .sendKeys("admin");

        driver.findElement(By.id("password"))
                .sendKeys("1234");

        driver.findElement(By.tagName("button"))
                .click();

        Thread.sleep(3000);

        String actual = driver.findElement(By.id("message")).getText();

        Assert.assertEquals(actual, "Login successful!");

        driver.quit();
    }
}