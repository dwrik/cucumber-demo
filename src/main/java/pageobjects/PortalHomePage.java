package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {

    // driver
    private final WebDriver driver;

    // locators
    private final By welcomeMessage = By.cssSelector("marquee.heading3");

    public PortalHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWelcomeMessage() {
        return driver.findElement(welcomeMessage);
    }
}
