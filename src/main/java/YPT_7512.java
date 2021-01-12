import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YPT_7512 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    @Test
    public void OgladanieNagranego() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/recording/details/5f9bd20f20d36b09ddc6a819");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("recording_btn_play")).click();
        Screenshoot.Screenshoot(driver,"odtwarzanie");
        TimeUnit.SECONDS.sleep(5);

        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
    @Test
    public void RecordingsDetails() throws IOException, InterruptedException {
        /*sprawdza czy da rade odczytac tytul nagrania, jego gatunek
        odcinek, opis, czas emisji, kanal, dostepnosc, sezon, lata produkcji
         */

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/recording/series/recorded/bid259391/14217/6");
        TimeUnit.SECONDS.sleep(2);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[4]/div[2]"))).perform();
       // driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[4]/div[2]")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[4]/div[2]/div[1]/div/div/a")).click();

        //driver.findElement(By.className("r-24")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(driver.findElement(By.id("recording_detail_title")).getText());
        System.out.println(driver.findElement(By.id("recording_details_type")).getText());
        System.out.println(driver.findElement(By.id("recording_details_description")).getText());
        System.out.println(driver.findElement(By.id("recording_details_episode")).getText());
        System.out.println(driver.findElement(By.id("recording_details_broadcast_time")).getText());
        System.out.println(driver.findElement(By.id("recording_details_channel")).getText());
        System.out.println(driver.findElement(By.id("recording_details_expiration")).getText());
        System.out.println(driver.findElement(By.id("recording_details_year")).getText());

        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
    @Test
    public void AktorzyRecordDetails() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/recording/details/5f9c156f20d36b09ddc6a829");
        TimeUnit.SECONDS.sleep(2);
        List<WebElement> aktorzy = driver.findElements(By.cssSelector("[data-id=\"actor_root\"]"));
        aktorzy.get(2).click();
        TimeUnit.SECONDS.sleep(5);
        Screenshoot.Screenshoot(driver,"wybrany aktor");
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"aktor-nagrania");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.className("error-footer-button")).click();
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
    @Test
    public void UsuwanieNagrywanego() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/recording/details/5f9bd20f20d36b09ddc6a819");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("recording_btn_delete")).click();
        Screenshoot.Screenshoot(driver,"usuwanie nagrywanego");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/button[2]")).click();
        Screenshoot.Screenshoot(driver,"usuniete");
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }
}
