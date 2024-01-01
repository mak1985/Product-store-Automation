package org.startup.proejctsample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {


    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Sore all the web elements
    @FindBy(css = "#login2") WebElement login_text_element;
    @FindBy(css = "#loginusername") WebElement username_element;
    @FindBy(css = "#loginpassword") WebElement password_element;
    @FindBy(xpath = "//button[text()='Log in']") WebElement logIn_btn_element;

    public void clickLogInLink() {
        login_text_element.click();
    }

    public void inputUsername(String uname){
        username_element.sendKeys(uname);
    }

    public void inputPassword(String pwd){
        password_element.sendKeys(pwd);
    }
    public void clickLogInButton() {
        logIn_btn_element.click();
    }
}
