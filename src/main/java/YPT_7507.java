import Methods.BeforeClass;
import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7507 extends Logging {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";

    org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    // slf4j wedlug najstarszych gorali jest lepszy od log4j

    @Test
    public void AboutApplication() throws IOException, InterruptedException {
        log.info("<----- Test 7507 - About application");
        WebDriver driver = BeforeClass.Start();

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);
        log.info("Zalogowano się username:"+username1+" password:"+password1);
        Screenshoot.Screenshoot(driver,"SCR-Login");
        logger.info("Password: {}", password1);
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
        log.info("<----- Test 7507 - Animations");
        WebDriver driver = BeforeClass.Start();

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);
        log.info("Zalogowano się username:"+username1+" password:"+password1);
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
        log.info("<----- Test 7507 - DevSettings");
        WebDriver driver = BeforeClass.Start();

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);
        log.info("Zalogowano się username:"+username1+" password:"+password1);
        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/dev");
        log.info("Przejscie do ustawien developerskich");
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
