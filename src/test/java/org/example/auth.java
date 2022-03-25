package org.example;

import io.qameta.allure.Step;
import org.example.Pages.Block.LoginPopup;
import org.example.Pages.MainPage;
import org.junit.jupiter.api.Test;


public class auth extends BaseTest {

    @Test
    @Step("вход в аккаунт")
    void accountlogin() {
       new MainPage(webDriver)
               .getHeader()
               .clickLoginButton()
               .login(LOGIN, PASSWORD);

    }

    @Test
    @Step("проверка пароля")
    void incorrectPasswordTest() {
        LoginPopup loginPopup = new MainPage(webDriver)
                .getHeader()
                .clickLoginButton();
        loginPopup.login(LOGIN, "incorrectPassword");
        loginPopup.checkErrorIsVisible("Неверный логин или пароль.");
    }
}




