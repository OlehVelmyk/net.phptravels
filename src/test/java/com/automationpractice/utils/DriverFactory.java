package com.automationpractice.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver initDriver(String browser) {
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
            }
        return new ChromeDriver();
    }
}
