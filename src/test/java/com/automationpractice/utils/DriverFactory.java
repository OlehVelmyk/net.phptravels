package com.automationpractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DriverFactory {

    public static WebDriver initDriver(String browser) {
        String osName = System.getProperty("os.name");
        if (osName.contains("nix")) {
            switch (browser) {
                case "firefox":
                    System.setProperty(
                            "webdriver.gecko.driver",
                            new File(DriverFactory.class.getResource("/" + "geckodriver").getFile()).getPath());
                    return new FirefoxDriver();
                case "chrome":
                    System.setProperty(
                            "webdriver.chrome.driver",
                            new File(DriverFactory.class.getResource("/" + "chromedriver").getFile()).getPath());
                    return new ChromeDriver();
            }
        }
        if (osName.contains("Windows")) {
            switch (browser) {
                case "firefox":
                    System.setProperty(
                            "webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
                    return new FirefoxDriver();
                case "chrome":
                    System.setProperty(
                            "webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                    return new ChromeDriver();
            }
        }
        return new ChromeDriver();
    }
}
