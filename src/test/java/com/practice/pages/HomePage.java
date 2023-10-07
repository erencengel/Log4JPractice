package com.practice.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "(//nav[@aria-label='Main']/ul/li[2]//span)[2]")
    private WebElement favoritesButton;

    @FindBy(xpath = "//*[@id='mini-cart-description']/../span[3]")
    private WebElement shoppingCard;

    @FindBy(css = "#global-enhancements-search-query")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@id='search-js-router-enabled']/../div/div/button[2]")
    private WebElement searchButton;

}
