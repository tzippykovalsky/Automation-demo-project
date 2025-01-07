package JUNIT.base;

import JUNIT.base.BaseTest;
import enums.BrowserType;
import enums.LocatorType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class FirstTestExample extends BaseTest {
    @Override
    void setBrowserName() {
        this.browserName = BrowserType.CHROME;
    }
    @Test
    public void testGoogleSearch() {
        driver.navigateTo("https://www.google.com");
        WebElement webElement = driver.findElement(LocatorType.className, "gLFyf");
        webElement.sendKeys("Selenium");
    }
}
