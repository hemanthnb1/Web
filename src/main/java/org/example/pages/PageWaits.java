package org.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class PageWaits {

    private WebDriver webDriver;
    private FluentWait wait;
    PageWaits(WebDriver driver){
        this.webDriver=driver;
    }
    private FluentWait initWait(WebDriver webDriver) {
        return new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }
    public List<WebElement> waitUntilAllElementsAreVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public WebElement waitForElementToBePresent(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
