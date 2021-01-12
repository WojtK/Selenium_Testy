import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7507 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    @Test
    public void AboutApplication() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/about_application");

        driver.findElement(By.id("about_btn_tos")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"Regulamin");
        driver.findElement(By.id("about_btn_tos")).click();

        driver.findElement(By.id("about_btn_privacy")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"Polityka_Prywatnosci");
        driver.findElement(By.id("about_btn_privacy")).click();

        driver.findElement(By.id("about_btn_analytics")).click();
        driver.findElement(By.className("switch")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"Dane_statystyczne");
        driver.findElement(By.id("about_btn_analytics")).click();

        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
    @Test
    public void Animations() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/animations");
        driver.findElement(By.className("switch")).click();
        Screenshoot.Screenshoot(driver,"animations-OFF");
        driver.findElement(By.className("switch")).click();
        Screenshoot.Screenshoot(driver,"animations-ON");
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
    @Test
    public void DevSettings() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/dev");

        driver.findElement(By.name("countryCode")).sendKeys("pl");
        Screenshoot.Screenshoot(driver,"Wpisane_DEV");
        driver.findElement(By.id("settings_dev_add_btn")).click();
        Screenshoot.Screenshoot(driver,"Wyslane");
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
}
