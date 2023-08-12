package org.example.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LauncherPage extends BasePage{

//    private WebDriver webDriver;
    public LauncherPage(WebDriver webDriver)
    {
        super(webDriver);
    }
    public boolean navigateTo(String URL)
    {
        webDriver.get(URL);
        return  isSiteLoaded();
    }
    private  boolean isSiteLoaded()
    {
        return new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(webDriver1 -> ((JavascriptExecutor)webDriver).
                        executeScript("return document.readyState").
                            equals("complete"));
    }




}
