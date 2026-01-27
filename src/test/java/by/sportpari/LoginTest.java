package by.sportpari;

import by.sportpari.driver.Driver;
import by.sportpari.pages.home.HomeLabel;
import by.sportpari.pages.home.HomePage;
import by.sportpari.pages.login.LoginLabel;
import by.sportpari.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import java.time.Duration;

import java.time.Duration;

import static by.sportpari.driver.Driver.driver;


public class LoginTest {
private HomePage homePage;
private LoginPage loginPage;

@BeforeEach
public void openHomePageCloseCookieOpenLoginPage() {
    homePage = new HomePage();
    homePage.open();
    homePage.clickKenoButton();
    homePage.clickOnEnter();

    loginPage = new LoginPage();
}

    @Test
    public void testLoginPageUrl() {
        Assertions.assertEquals(loginPage.LOGIN_URL, Driver.getDriver().getCurrentUrl());
    }

    @Test
    
    public void testLoginPageSingInText() {
    Assertions.assertEquals(LoginLabel.SING_IN_TEXT, loginPage.getSingInText());
    }

    @Test
    public void testLoginPageUserNameOrEmailText() {
    Assertions.assertEquals(LoginLabel.TEXT_USER_NAME_OR_EMAIL, loginPage.getUserNameOrEmailText());
    }

    @Test
    public void testLoginPageNumberPhoneText() {
    Assertions.assertEquals(LoginLabel.TITLE_NUMBER_PHONE, loginPage.getNumberPhoneText());
    }

    @Test
    Assertions."Введенные данные недействительны"

    @AfterEach
    public void quitDriver() {
    Driver.quit();
    }
}
