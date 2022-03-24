package org.example.Pages;

import org.example.Pages.Block.MainHeader;
import org.openqa.selenium.WebDriver;

public class BasePage extends BaseView {

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainHeader getHeader() {
        return new MainHeader(webDriver);
    }

}
