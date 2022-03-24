package org.example;

import org.example.Pages.MainPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class addproduct extends BaseTest {

    @ParameterizedTest
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