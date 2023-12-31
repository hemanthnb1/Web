//package org.example.drivers;
//
//import org.example.Internal.Toggles;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.sql.DriverManager;
//
//public class ChromeDriverManager implements DriverManager {
//
//    @Override
//    public WebDriver create() {
//
//        if(Toggles.HEADLESS.isOn()) {
//            return createHeadlessChromeDriver();
//        }
//        return new io.github.bonigarcia.wdm.managers.ChromeDriverManager().create();
//    }
//
//    private ChromeDriver createHeadlessChromeDriver() {
//        new io.github.bonigarcia.wdm.managers.ChromeDriverManager().setup();
//        ChromeOptions chromeOptions = getHeadlessChromeOptions();
//        return new ChromeDriver(chromeOptions);
//    }
//
//    private ChromeOptions getHeadlessChromeOptions() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--no-sandbox");
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("disable-gpu");
//        return chromeOptions;
//    }
//}