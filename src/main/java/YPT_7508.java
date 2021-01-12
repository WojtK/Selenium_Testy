import Methods.Logging;
import Methods.Screenshoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YPT_7508 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    @Test
    public void ProfileName() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/name");

        driver.findElement(By.id("epgChannelCategoriesDropdown")).click();

        driver.findElements(By.className("profile-wrapper")).get(3).click();
        driver.findElement(By.id("profile_name_input")).sendKeys("Konto zmienione");
        Screenshoot.Screenshoot(driver,"Wpisana nazwa");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(By.id("profile_name_save_btn")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"Nowa nazwa");


        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void ProfileImage() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/image");

        driver.findElement(By.id("profile_image_select_btn")).click();
        TimeUnit.SECONDS.sleep(6);
        Screenshoot.Screenshoot(driver,"Zmienione profilowe");
        driver.findElement(By.id("profile_image_save_btn")).click();



        TimeUnit.SECONDS.sleep(3);

        driver.findElement(By.id("profile_image_default_btn")).click();
        TimeUnit.SECONDS.sleep(3);

        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void ProfileDelete() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("epgChannelCategoriesDropdown")).click();

        driver.findElements(By.className("profile-wrapper")).get(2).click();

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/delete");

        driver.findElement(By.id("profile_delete_profile_btn")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"tak/nie");
        //TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("assent_btn_accept")).click();


        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }


    @Test
    public void ProfileRecommendation() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/recommendation");

        driver.findElement(By.id("menu_settings_switch")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"Polecane");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("menu_settings_switch")).click();

        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    //Dodac klikniecie "zapisz zmiany"
    @Test
    public void ProfileSound() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/sound");

        List<WebElement> languages = driver.findElements(By.id("profile_voice_language_radio_list"));
        TimeUnit.SECONDS.sleep(3);
        languages.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        languages.get((languages.size()-1)).click();
        driver.findElement(By.id("profile_voice_language_save_btn")).click();
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    //Dodac klikniecie "zapisz zmiany"
    @Test
    public void ProfileSubtitles() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/language");

        List<WebElement> languages = driver.findElements(By.id("profile_voice_language_radio_list"));
        TimeUnit.SECONDS.sleep(3);
        languages.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        languages.get((languages.size()-1)).click();
        driver.findElement(By.id("profile_voice_language_save_btn")).click();
        Logging.Log_out(driver);

        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }


}
