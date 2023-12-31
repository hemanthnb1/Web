import org.example.drivers.DriverCreator;
import org.example.pages.HomePage;
import org.example.models.Item;
import org.example.pages.LauncherPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class searchtest {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        String searchItem = "Jeans";
        WebDriver webdriver=new DriverCreator().create("chromedriver");

        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
        HomePage homepage = new HomePage();
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();
         Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains("Jeans")));
    }

//    @Test
//    public void verifyBrandSearchListsOnlyBrandItems() {
//        String brandName = "Jeans";
//        WebDriver webDriver = new ChromeDriver();
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//        HomePage homepage = new HomePage(webDriver);
//        homepage=homepage.search(brandName);
//        List<Item> searchItems = homepage.getSearchItems();
//        Assert.assertEquals(searchItems.size(),0);
//        webDriver.quit();
//    }
//
//    @Test
//    public void verifySearchUnavailableProduct() {
//        String unavailableProduct = "Unobtainium Widget";
//        WebDriver webDriver = null;
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//        HomePage homepage = new HomePage(webDriver);
//        homepage.search(unavailableProduct);
//        List<Item> searchItems = homepage.getSearchItems();
//        Assertions.assertTrue(searchItems.isEmpty());
//    }
//
//    @Test
//    public void verifySearchResultCountMatchesDisplayedItems() {
//        String searchItem = "Shoes";
//        WebDriver webDriver = null;
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//        HomePage homepage = new HomePage(webDriver);
//        homepage.search(searchItem);
//        List<Item> searchItems = homepage.getSearchItems();
//        int itemCountDisplayed = homepage.getItemCount(); // Assume getItemCount method returns the number displayed on the page
//        Assert.assertEquals(searchItems.size(), itemCountDisplayed);
//    }



}
