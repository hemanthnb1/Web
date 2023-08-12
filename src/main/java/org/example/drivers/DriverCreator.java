package org.example.drivers;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class DriverCreator {
    public WebDriver create(String browser) {
        browser = setDefaultBrowser(browser);
        switch (browser.toLowerCase()) {
            case "firefox":
                return new FirefoxDriverManager().create();
            case "safari":
                return new SafariDriverManager().create();
            default:
                return new ChromeDriverManager().create();
        }
    }

        private String setDefaultBrowser(String browserName)
        {
            if(Objects.isNull(browserName)||browserName.isEmpty())
            {
                return "chrome";
            }
            return browserName;
        }



}
