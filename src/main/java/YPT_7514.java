import Methods.Logging;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7514 {


    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";



    @Test
    public void Recording_Player() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.id("main_btn_myzone")).click();
        driver.findElement(By.id("main_btn_recording")).click();
        TimeUnit.SECONDS.sleep(3);
        new Actions(driver).moveToElement(driver.findElement(By.id("recording_entry_frame"))).perform();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[3]/div[2]/div/a/div/div[1]")).click();
        TimeUnit.SECONDS.sleep(2);
        new Actions(driver).moveToElement(driver.findElement(By.id("recording_entry_frame"))).perform();
        driver.findElement(By.id("ctx_recording_entry_play")).click();
        TimeUnit.SECONDS.sleep(3);
        new Actions(driver).moveToElement(driver.findElement(By.id("player_outer_frame"))).perform();
        driver.findElement(By.id("player_ctrl_btn_settings")).click();
        TimeUnit.SECONDS.sleep(3);
        new Actions(driver).moveToElement(driver.findElement(By.id("player_outer_frame"))).perform();
        driver.findElement(By.id("player_ctrl_btn_mute")).click();
        TimeUnit.SECONDS.sleep(1);
        new Actions(driver).moveToElement(driver.findElement(By.id("player_outer_frame"))).perform();
        driver.findElement(By.id("player_ctrl_btn_fullscreen")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}
