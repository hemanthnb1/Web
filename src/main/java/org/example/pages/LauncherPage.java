package org.example.pages;
import org.openqa.selenium.WebDriver;


public class LauncherPage {

    private WebDriver webDriver;
    public LauncherPage(WebDriver webDriver)
    {
    this.webDriver=webDriver;
    }
    public boolean navigateTo(String URL)
    {
        webDriver.get(URL);
//        return  isSiteLoaded();
    return  true;
    }



}
