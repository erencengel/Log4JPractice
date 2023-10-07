package com.practice.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchedPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(),'Most Loved')]")
    private WebElement mostLovedElement;

}
