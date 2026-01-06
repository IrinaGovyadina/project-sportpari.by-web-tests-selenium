package by.sportpari.pages.login;

import org.openqa.selenium.By;

public class LoginLocator {

    public static final By PROFILE_PAGE_TITLE = By.xpath("//p[@class='card-title']");
    public static final By USER_NAME_OR_EMAIL = By.xpath("//input[@class='form-field__input-text  form-field__input-text_error']");
    public static final By OR_TITLE = By.xpath("//div[@class='form-item__or']");
    public static final By NUMBER_PHONE = By.xpath("//label[@class='form-item__label' and @for='phone_number']");
    public static final By PASSWORD = By.xpath("//label[@class='form-item__label' and @for='password']");
    public static final By REMEMBER_ME_BUTTON = By.xpath("//span[@class='checkbox__text']");
    public static final By LOGIN_BUTTON = By.xpath("//input[@class='button button_primary button_wide']");
}
