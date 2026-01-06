package by.sportpari.pages.home;

import org.openqa.selenium.By;

public class HomeLocator {

    public static String enterButton = "//a[@class='button header-cell__item button_login']";

    public static final By ADDRESS_LINE = By.xpath("//p[@class='footer__text footer__text_enlarged']");
    public static final By EMAIL_LINE = By.xpath("//a[@href='mailto: info@sportpari.by']");
    public static final By HOW_TO_GET_WINNINGS_LINE = By.xpath("//a[@href='/help/gde-i-kak-mozhno-poluchit-vyigrysh-ru']");
    public static final By ABOUT_US_LINE = By.xpath("//a[@href='/about-us']");
}
