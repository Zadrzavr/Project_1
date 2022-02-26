package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accountlogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://pop-music.ru/");

        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div[2]/div[1]/div[4]/a[2]")).click();

        Thread.sleep(5000);

        WebElement athoPopap = webDriver.findElement(By.xpath("//*[@id=\"popup-login\"]/div[1]/div/div[1]"));
        Thread.sleep(2000);


        Thread.sleep(2000);

        athoPopap.findElement(By.name("USER_LOGIN")).sendKeys("cokone1569@sueshaw.com");
        athoPopap.findElement(By.name("USER_PASSWORD")).sendKeys("Tartii1234");
        athoPopap.findElement(By.name("Login")).click();

        Thread.sleep(2000);


    }



}
