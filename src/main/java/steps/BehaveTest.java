package steps;

import Methods.Logging;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BehaveTest {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/landing_page";
    static WebDriver driver;
    @Before
    public static WebDriver doSomethingBefore() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @Given("user is on Orange TV Go website {string}")
    public void GetWebSite(String url) throws IOException, InterruptedException {
        driver.get(url);
    }

    @When("user fills valid username {string} and valid password {string} and submits it")
    public void Login(String username, String password) throws IOException, InterruptedException {
        Logging.Log_In(driver,username,password);
        TimeUnit.SECONDS.sleep(5);
    }

    @Then("User logout")
    public void Logout() throws IOException, InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
    }
}
