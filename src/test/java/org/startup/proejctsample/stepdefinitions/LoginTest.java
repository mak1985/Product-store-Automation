package org.startup.proejctsample.stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.startup.proejctsample.utils.CommonUtils;


public class LoginTest extends CommonUtils {
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    @Given("user is on product store url page")
    public void user_is_on_product_store_url_page() {
        launchUrl("base.url");
        logger.info("Able to launch the url");
    }

    @When("user clicks on logIn text link")
    public void user_clicks_on_logIn_text_link() {
        loginPage.clickLogInLink();
        logger.info("Able to click on logIn text link");
    }

    @Then("log in window popup display")
    public void log_in_window_popup_display() {
        logger.info("Able to see log in window popup display");
    }

    @When("user enters {string}")
    public void user_enters(String username) {
        loginPage.inputUsername(username);
        logger.info("Able to enter username");
    }

    @When("user enter {string}")
    public void user_enter(String password) {
        loginPage.inputPassword(password);
        logger.info("Able to enter password");
    }


    @Then("user should navigate to home page successfuly")
    public void user_should_navigate_to_home_page_successfuly() throws InterruptedException {
        Thread.sleep(5000);
        logger.info("Able to click on log in button");
    }

    @And("user clicks on log in button")
    public void userClicksOnLogInButton() {
        loginPage.clickLogInButton();
        logger.info("Able to navigate to home page successfully");
    }
}
