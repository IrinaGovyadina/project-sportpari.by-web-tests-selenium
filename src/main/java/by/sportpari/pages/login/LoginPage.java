package by.sportpari.pages.login;

import by.sportpari.driver.Driver;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public final String LOGIN_URL = "https://sportpari.by/ru/login";

    private WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public String getLoginPageTitleText() {
        return driver.findElement(LoginLocator.PROFILE_PAGE_TITLE).getText();
    }

    public String getUserNameOrEmailText() {
        return driver.findElement(LoginLocator.USER_NAME_OR_EMAIL).getText();
    }
public boolean isUserNameOrEmailDisplayed() {
        return driver.findElement(LoginLocator.USER_NAME_OR_EMAIL).isDisplayed();
}

public String getLoginPageTextOr() {
        return driver.findElement(LoginLocator.OR_TITLE).getText();
}

public String getNumberPhoneText() {
        return driver.findElement(LoginLocator.NUMBER_PHONE).getText();
}

public boolean isNumberPhoneDisplayed() {
        return driver.findElement(LoginLocator.NUMBER_PHONE).isDisplayed();
}

public String getPasswordText() {
        return driver.findElement(LoginLocator.PASSWORD).getText();
}

public boolean isPasswordDisplayed() {
        return driver.findElement(LoginLocator.PASSWORD).isDisplayed();
}

public String getRememberMeText() {
        return driver.findElement(LoginLocator.REMEMBER_ME_BUTTON).getText();
}

public boolean isRememberMeDisplayed() {
        return driver.findElement(LoginLocator.REMEMBER_ME_BUTTON).isDisplayed();
}

public String getLoginButtonText() {
        return driver.findElement(LoginLocator.LOGIN_BUTTON).getText();
}

public void clickLoginButton() {
        driver.findElement(LoginLocator.LOGIN_BUTTON).click();
}
}
