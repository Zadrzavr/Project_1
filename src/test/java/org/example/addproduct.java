package org.example;

import jdk.jfr.Description;
import org.example.Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Корзина")
public class addproduct extends BaseTest {

    @ParameterizedTest
    @DisplayName("добавление товара в корзину")
    @Description("добавление гитары в корзину")
    @ValueSource(strings = {"Электроакустический бас BATON ROUGE X11S/BSCE"})
    void addProductTest(String productName) {
        new MainPage(webDriver)
                .getHeader()
                .goToProductPage("Гитары", "Акустические бас-гитары")
                .selectProduct("Электроакустический бас BATON ROUGE X11S/BSCE")
                .goToCart()
                .checkCartContainsProducts(productName);



    }
}