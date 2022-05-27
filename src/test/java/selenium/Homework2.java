package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
@Test
public void homeworkSelenium(){

    System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
    WebDriver browser = new ChromeDriver();
    browser.manage().window().maximize();
    browser.get("http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN");
}
                }
