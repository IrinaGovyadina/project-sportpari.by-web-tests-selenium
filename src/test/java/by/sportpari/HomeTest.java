package by.sportpari;

import by.sportpari.driver.Driver;
import by.sportpari.pages.home.HomeLabel;
import by.sportpari.pages.home.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void openHomePage() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieToAccept();
    }

    @Test
    public void testHomePageURL() {
        Assertions.assertEquals(homePage.BASE_URL, Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testVerifyAddress() {
        Assertions.assertEquals(HomeLabel.ADDRESS_LABEL, homePage.getAddressText());
    }

    @Test
    public void testVerifyEmail() {
        Assertions.assertEquals(HomeLabel.EMAIL_LABEL, homePage.getEmailText());
    }

    @Test
    public void testHowToGetWinningsBlockTitle() {
        Assertions.assertTrue(homePage.getHowToGetWinningsText().contains(HomeLabel.HOW_TO_GET_WINNINGS_LABEL));
    }

    @Test
    public void testAboutUsBlockTitle() {
        Assertions.assertEquals(HomeLabel.ABOUT_US_LABEL, homePage.getAboutUsText());
    }

    @AfterEach
    public void quit() {
        Driver.quit();
    }
}
