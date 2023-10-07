package com.practice.step_defs;

import com.practice.pages.HomePage;
import com.practice.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.testng.Assert;

@Slf4j
public class Home_StepDefs {

    HomePage homePage = new HomePage();

    @Given("Validate home page")
    public void validate_home_page() {
        Assert.assertEquals(BrowserUtils.getElementText(homePage.getSignInButton()), "Sign in");
        log.info("validate sign in button");
        Assert.assertTrue(homePage.getFavoritesButton().isDisplayed());
        log.info("validate favorites button");
        Assert.assertTrue(homePage.getShoppingCard().isDisplayed());
        log.info("validate shopping card button");
    }

    @Given("Send data in to search bar")
    public void send_data_in_to_search_bar() {
        BrowserUtils.sendText(homePage.getSearchBar(), "Selenium" + Keys.ENTER);
        log.info("send text");
    }
    @Given("Tap on search button")
    public void tap_on_search_button() {
        //BrowserUtils.clickWithJS(homePage.getFavoritesButton());
        //log.info("tap on search button");
        BrowserUtils.waitFor(5);
    }
}
