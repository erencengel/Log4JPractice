package com.practice.step_defs;

import com.practice.pages.SearchedPage;
import com.practice.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Slf4j
public class SearchedPage_StepDefs {

    SearchedPage searchedPage = new SearchedPage();

    @Given("Validate that most loved element is visible")
    public void validate_that_most_loved_element_is_visible() {
        Assert.assertTrue(searchedPage.getMostLovedElement().isDisplayed());
        log.info("validate that most loved element is visible");
        Assert.assertEquals(BrowserUtils.getElementText(searchedPage.getMostLovedElement()), "Most Loved");
    }

}
