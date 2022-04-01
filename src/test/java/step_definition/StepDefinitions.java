package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pageobjects.LoginPage;
import pageobjects.PortalHomePage;
import resources.Base;

public class StepDefinitions extends Base {

    @Given("driver is initialized")
    public void driverIsInitialized() {
        initializeDriver();
    }

    @Given("user is on the login page {string}")
    public void userIsOnTheLoginPage(String url) {
        driver.get(url);
    }

    @When("user logs in using {string} and {string}")
    public void userLogsInUsingAnd(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsername().sendKeys(username);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLogin().click();
    }

    @Then("verify user is logged in")
    public void verifyUserIsLoggedIn() {
        PortalHomePage portalHomePage = new PortalHomePage(driver);
        Assert.assertTrue(portalHomePage.getWelcomeMessage().isDisplayed());
    }

    @Then("verify user is not logged in")
    public void verifyUserIsNotLoggedIn() {
        Alert alert = driver.switchTo().alert();
        String expected = "User or Password is not valid";
        Assert.assertEquals("user is not logged in", expected, alert.getText());
        alert.accept();
    }

    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }

}
