package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopTest {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private final By FAVORITE_ITEMS = By.xpath(".//div[@class = 'favorite-items']");
    private final By MAIN_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By SITE_TOP = By.xpath(".//a[@class = 'site-top__menu-left-link']");
    private final By LANGUAGE_SWITCHER = By.xpath(".//li[@class= 'site-top__menu-right-item language-switcher']");
    private final By MAIN_SEARCH = By.xpath(".//div[@class = 'main-search__submit']");
    private final By SUBMENU_LINK = By.xpath(".//a[@class= 'submenu-lvl1__link']");
    private final By COOKIE_BOT = By.id(".//a[@id= 'CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);
    }
}


