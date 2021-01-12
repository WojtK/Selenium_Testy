import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YPT_7498 {

        String username = "9999999088";
        String password = "4365";
        String username1 = "9999900018";
        String password1 = "0018";
        String url = "https://devfrontendtv.sdqac.rd.tp.pl/";






    @Test
    public void SeeTrailer() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");

        driver.findElement(By.id("vod_details_payment_btn_trailer")).click();
        TimeUnit.SECONDS.sleep(5);
        Screenshoot.Screenshoot(driver,"Trailer");
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void VodPurchase() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("vod_details_payment_price")).click();
        TimeUnit.SECONDS.sleep(1);
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //WebElement tos_checkbox = driver.findElement(By.id("purchase_summary_tos_checkbox"));
        //js.executeScript("arguments[0].scrollIntoView();", tos_checkbox);
        driver.findElement(By.id("purchase_summary_btn_cancel")).sendKeys(Keys.CONTROL, Keys.END);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("purchase_summary_tos_checkbox")).click();
        Screenshoot.Screenshoot(driver,"kupno");
        driver.findElement(By.id("purchase_summary_btn_confirm")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("purchase_finished_btn_ok")).click();
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void AddToFav() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");

        driver.findElement(By.id("menu_fav")).click();
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"Add_To_Fav");
        driver.findElement(By.id("menu_fav")).click();
        Screenshoot.Screenshoot(driver,"Not_in_fav");
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void InfoAboutVod() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");
        System.out.println(driver.findElement(By.id("vod_details_info_title")).getText());
        System.out.println(driver.findElement(By.id("vod_details_info_original_title")).getText());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(driver.findElement(By.id("vod_details_info_genre")).getText());
        Screenshoot.Screenshoot(driver,"About account");
        System.out.println(driver.findElement(By.id("vod_details_info_description")).getText());
        System.out.println(driver.findElement(By.className("vod-info")).getText());
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    //Jest ok, ale trzeba ogarnac ten blad co wyskakuje przez npvr
    @Test
    public void ActorsVod() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");

        List<WebElement> aktorzy = driver.findElements(By.cssSelector("[data-id=\"actor_frame\"]"));
        aktorzy.get(2).click();


        Screenshoot.Screenshoot(driver,"Aktorzy_VOD");
        TimeUnit.SECONDS.sleep(1);
      //  driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[3]/div")).click();
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void AnotherVOD() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");
      //  List<WebElement> aktorzy = driver.findElements(By.cssSelector("[data-id=\"actor_frame\"]"));
        TimeUnit.SECONDS.sleep(1);
        List<WebElement> vod = driver.findElements(By.cssSelector("[data-id=\"vod_entry_frame\"]"));
        vod.get(2).click();
        // for (WebElement device: another_vod) {
        //    System.out.println(device.getText());
       // }
        TimeUnit.SECONDS.sleep(1);
        vod.get(5).click();
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void WatchVOD() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/details/20191113IMPREZOWIRODZICE");

        driver.findElement(By.id("vod_details_btn_play")).click();
        TimeUnit.SECONDS.sleep(15);
        Screenshoot.Screenshoot(driver,"vod playing");
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

}
