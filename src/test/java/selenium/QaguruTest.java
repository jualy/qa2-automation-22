package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaguruTest {


    private final String HOME_PAGE = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";

    private final By FORM_FIELD = By.id("fullForm");
    private final By TOOLBAR = By.xpath(".//div[@class = 'toolbar']");
    private final By NOTATION = By.xpath(".//span[@class = 'notation']");
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BUGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By INFO_TXT = By.xpath(".//div[@class = 'infoTxt']");
    private final By RESPONSE = By.id("response");
    private final By BOOK = By.id("book2");

    private final By GET_PRICE = By.xpath(".//span[@style = 'cursor: pointer;']");

    @Test


    public void searchFieldsCheck(){
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);

        browser.findElement(GET_PRICE).click();

//        WebElement searchField = browser.findElement(GET_PRICE);
//        searchField.sendKeys("Get Price");
//        searchField.sendKeys(Keys.ENTER);

    }
}
