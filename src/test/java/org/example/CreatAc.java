package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@DisplayName("Создание Аккаунта")
public class CreatAc extends BaseTest {

    @Test
    @DisplayName("Создание нового аккаунта")
    @Description("создание нового аккаунта на сайте")
    void CreatAc(){

        webDriver.get("https://pop-music.ru/");
        webDriver.manage().window().setSize(new Dimension(1500, 1100));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.findElement(By.xpath("//div[@class='header__links']//a[div[text()='Войти']]")).click();




        WebElement authPopup = webDriver.findElement(By.xpath("//div[@class='popup-login__tab is-active']"));
        authPopup.findElement(By.xpath("//*[@id='popup-login']/div[1]/div/div[1]/div[2]/button/span")).click();
        authPopup.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[2]/div/input")).sendKeys("cokone1569@sueshaw.com");
        authPopup.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[3]/div/input")).sendKeys("Tartii1234");
        authPopup.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[4]/div/input")).sendKeys("Tartii1234");
        authPopup.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[5]/button")).click();

    }
}
