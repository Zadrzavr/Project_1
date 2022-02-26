package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class addproduct {
    public static void main(String[] args) {
        String productName = "Бас-гитара CORT AB850F BK W_BAG";

        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://pop-music.ru/");
        webDriver.manage().window().setSize(new Dimension(1500, 1100));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        new Actions(webDriver)
                .moveToElement(webDriver.findElement(By.xpath("//ul[@data-type='header']//li/a[text()='Гитары']")))
                .build()
                .perform();

        webDriver.findElement(By.xpath("//ul[@data-type='header']//li/a[text()='Акустические бас-гитары']")).click();

        List<WebElement> products = webDriver.findElements(By.xpath("//div[@class='product-card ']"));
        WebElement selectedProduct = products.stream()
                .filter(product -> product.findElement(By.xpath(".//a[@class='product-card__name']"))
                        .getText().equals("Бас-гитара CORT AB850F BK W_BAG"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("productName"));
        selectedProduct.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[5]/a")).click();

        webDriver.findElement(By.xpath("//*[contains(text(),'Перейти в корзину')]")).click();

        System.out.print("Actual products: ");
        webDriver.findElement(By.className("cart-table"))
                .findElements(By.xpath("./div"))
                .forEach(product -> System.out.print(product.findElement(By.className("cart-table__name")).getText() + " "));
        System.out.println();
        System.out.println("Expected products: " + productName);

        webDriver.quit();
    }
}
