package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver webDriver;
    public final String LOGIN = "cokone1569@sueshaw.com";
    public final String PASSWORD = "Tartii1234";

    @BeforeEach
    void setUp() {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--blink-settings=imagesEnabled=false");
        webDriver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://pop-music.ru/");
        webDriver.manage().window().setSize(new Dimension(2000, 1500));

        webDriver = WebDriverManager.chromedriver().create();
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}
