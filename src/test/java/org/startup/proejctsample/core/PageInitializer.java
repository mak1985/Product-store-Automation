package org.startup.proejctsample.core;

import org.startup.proejctsample.pages.HomePage;
import org.startup.proejctsample.pages.LoginPage;

public class PageInitializer extends BaseClass{
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static void initialize() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage();
    }
}
