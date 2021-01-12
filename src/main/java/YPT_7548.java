import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7548 {


    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";






    @Test
    public void ContinueWithoutLogin() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement politics = driver.findElement(By.className("btn-accept"));

        if (politics.isDisplayed())
            politics.click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("welcome_btn_continue")).click();
        TimeUnit.SECONDS.sleep(5);

        driver.quit();
    }


    @Test
    public void Login() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement politics = driver.findElement(By.className("btn-accept"));

        if (politics.isDisplayed())
            politics.click();

        driver.findElement(By.id("welcome_btn_login")).click();

        driver.findElement(By.name("username")).sendKeys(username1);
        driver.findElement(By.name("password")).sendKeys(password1);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("login_check_tos")).click();

        driver.findElement(By.id("login_btn_login")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }


    @Test
    public void RememberMe() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement politics = driver.findElement(By.className("btn-accept"));

        if (politics.isDisplayed())
            politics.click();

        driver.findElement(By.id("welcome_btn_login")).click();

        driver.findElement(By.name("username")).sendKeys(username1);
        driver.findElement(By.name("password")).sendKeys(password1);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("login_check_remember")).click();
        driver.findElement(By.id("login_check_tos")).click();
        driver.findElement(By.id("login_btn_login")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }


}
