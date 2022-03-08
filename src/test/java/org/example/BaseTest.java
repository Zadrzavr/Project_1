package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeEach
    void setUp() {

        webDriver = WebDriverManager.chromedriver().create();
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}
