package org.startup.proejctsample.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.startup.proejctsample.config.ConfigsReader;
import org.startup.proejctsample.config.Constants;

import java.time.Duration;
import java.util.Objects;

public class BaseClass {
    public static WebDriver driver;

    public static WebDriver setUp() {
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperty("browser").toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("--headless");  // Enable headless mode
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "ie":
                driver = new InternetExplorerDriver();
                break;

            default:
                throw new RuntimeException("Browser is not supported!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
        //driver.get(ConfigsReader.getProperty("base.url"));
        PageInitializer.initialize();
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static String launchUrl(String url) {
        driver.get(ConfigsReader.getProperty("base.url"));
        return url;
    }
}
