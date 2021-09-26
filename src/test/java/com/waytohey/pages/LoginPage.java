package com.waytohey.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement login = $("#input_login");
    private SelenideElement password = $("#input_pass");
    private SelenideElement submitLogin = $("#form_login [type='submit'].accept_btn");

    public void login(String login, String password) {
        open("https://waytohey.com/#login");
        this.login.setValue(login);
        this.password.setValue(password);
        submitLogin.click();
        acceptCookies();
    }

    void acceptCookies() {
        $("#gdpr_popup [value='Accept']").click();
    }
}