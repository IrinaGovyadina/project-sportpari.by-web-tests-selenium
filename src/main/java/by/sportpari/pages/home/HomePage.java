package by.sportpari.pages.home;

import by.sportpari.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final String BASE_URL = "https://sportpari.by/ru/";

    private WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void clickCookieToAccept() {
        driver.findElement(By.xpath(HomeLocator.COOKIE_TO_ACCEPT)).click();
    }

    public void clickOnEnter() {
        driver.findElement(By.xpath(HomeLocator.enterButton)).click();
    }

    public String getEnterButtonText() {
        return driver.findElement(By.xpath(HomeLocator.enterButton)).getText();
    }

    public String getAddressText() {
        return driver.findElement(HomeLocator.ADDRESS_LINE).getText();
    }

    public String getEmailText() {
        return driver.findElement(HomeLocator.EMAIL_LINE).getText();
    }

    public String getHowToGetWinningsText() {
        return driver.findElement(HomeLocator.HOW_TO_GET_WINNINGS_LINE).getText();
    }

    public String getAboutUsText() {
        return driver.findElement(HomeLocator.ABOUT_US_LINE).getText();
    }
}
