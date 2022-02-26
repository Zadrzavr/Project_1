package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatAc
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://pop-music.ru/");



        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div[2]/div[1]/div[4]/a[2]")).click();



        Thread.sleep(5000);



        WebElement athoPopap = webDriver.findElement(By.xpath("//*[@id=\"popup-login\"]/div[1]/div/div[1]"));
        Thread.sleep(5000);
        athoPopap.findElement(By.xpath("//*[@id='popup-login']/div[1]/div/div[1]/div[2]/button/span")).click();

        Thread.sleep(5000);

        athoPopap.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[2]/div/input")).sendKeys("cokone1569@sueshaw.com");
        athoPopap.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[3]/div/input")).sendKeys("Tartii1234");
        athoPopap.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[4]/div/input")).sendKeys("Tartii1234");
        athoPopap.findElement(By.xpath("//*[@id=\"reg-form\"]/div[2]/div[5]/button")).click();

        Thread.sleep(5000);
        webDriver.quit();


    }
}
