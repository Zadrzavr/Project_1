package org.example;

import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.example.Pages.Block.LoginPopup;
import org.example.Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Авторизация")
public class auth extends BaseTest {

    @Test
    @DisplayName("вход в аккаунт")
    @Description("успешная авторизация")
    @Feature("Авторизация на сайте")
    void accountlogin() {
       new MainPage(webDriver)
               .getHeader()
               .clickLoginButton()
               .login(LOGIN, PASSWORD);

    }

    @Test
    @DisplayName("Авторизация:негативый сценарий: неверный пароль")
    void incorrectPasswordTest() {
        LoginPopup loginPopup = new MainPage(webDriver)
                .getHeader()
                .clickLoginButton();
        loginPopup.login(LOGIN, "incorrectPassword");
        loginPopup.checkErrorIsVisible("Неверный логин или пароль.");
    }
}




