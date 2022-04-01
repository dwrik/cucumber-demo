package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    // driver
    private final WebDriver driver;

    // locators
    private final By username = By.cssSelector("input[name='uid']");
    private final By password = By.cssSelector("input[name='password']");
    private final By loginBtn = By.cssSelector("input[name='btnLogin']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLogin() {
        return driver.findElement(loginBtn);
    }
}
