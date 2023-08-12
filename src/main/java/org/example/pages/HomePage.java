package org.example.pages;

import org.example.models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    By searchIcon = By.cssSelector("summary[aria-label='Search']");
    //    By searchBar = By.id("Search-In-Modal");
    By searchBar = By.xpath("/html/body/div[2]/sticky-header/header/div/details-modal/details/div/div[2]/predictive-search/form/div[1]/input[1]");

    By searchResults = By.cssSelector("li[id^='predictive-search-option'] a");
//    li[id^='predictive-search-option'] a

    // Scoped Element
    By productName = By.cssSelector(".predictive-search__item-heading");

//    private WebDriver webDriver;
//
//    public HomePage(WebDriver webDriver) {
//        super(webDriver);
//    }

    public HomePage search(String search_key) {
        actions.click(searchIcon);
        actions.type(searchBar,search_key);
        return this;

    }

        public List<Item> getSearchItems() {
        List<WebElement> elements = waits.waitUntilAllElementsAreVisible(searchResults);
        List<Item> items = new ArrayList<>();
        for (WebElement element : elements) {
//            String name = element.findElement(productName).getText();
            String name = actions.getChildText(element,productName);
            Item item = new Item();
            item.setName(name);
            items.add(item);
        }
        return items;
    }

//    public int getSearchItems() {
//        List<WebElement> elements = webDriver.findElements(searchResults);
//        return elements.size();
//    }
}
