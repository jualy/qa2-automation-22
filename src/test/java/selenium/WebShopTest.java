package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
    private final By COOKIE_BOT = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
private final String CATEGORY_NAME = "Apple AirPods";
    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(COOKIE_BOT));

        browser.findElement(COOKIE_BOT).click();

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> subMenuItems = browser.findElements(PRODUCT_TYPE);

        boolean flag = false;
        for (WebElement we : subMenuItems) {
            if (we.getText().equals(CATEGORY_NAME)) {
                flag = true;
                wait.until(ExpectedConditions.elementToBeClickable(we));
               try {
                   we.click();
               } catch (ElementClickInterceptedException e) {
                   we.click();
               }

                break;

            }
        }
        Assertions.assertTrue(flag, "Category not found");
    }


}


