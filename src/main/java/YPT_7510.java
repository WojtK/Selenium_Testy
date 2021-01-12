import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7510 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    @Test
    public void SearchPanel() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver, username1, password1);

        Screenshoot.Screenshoot(driver, "SCR-Login");


        driver.findElement(By.id("searchList")).sendKeys("Mad Max");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("searchList")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "After search");
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "SCR-Logout");

        driver.quit();

    }

    @Test
    public void SearchPanelVOD() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver, username1, password1);

        Screenshoot.Screenshoot(driver, "SCR-Login");


        driver.findElement(By.id("searchList")).sendKeys("Mad Max");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("searchList")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "After search");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.className("more-button-link")).click();
        TimeUnit.SECONDS.sleep(2);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "SCR-Logout");

        driver.quit();

    }

    @Test
    public void SearchPanelTitle() throws IOException, InterruptedException {

        String title = "Imprezowi rodzice HD";

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver, username1, password1);

        Screenshoot.Screenshoot(driver, "SCR-Login");


        driver.findElement(By.id("searchList")).sendKeys(title);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("searchList")).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "After search");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.cssSelector("[title=\""+title+"\"]")).click();
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver, "SCR-Logout");
        driver.quit();

    }
}
