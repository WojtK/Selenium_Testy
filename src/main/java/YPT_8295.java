import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_8295 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/YPT-8295/landing_page";
    static Logger log = Logger.getLogger(YPT_8295.class.getName());

    @Test
    public void OTGActivation() throws IOException, InterruptedException {
        log.info("<----- SCENARIUSZ Nagrania_YPT6450: Nagrania - ekran szczegółów - usuwanie/anulowanie.");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(1);
        WebElement politics = driver.findElement(By.className("btn-accept"));

        if (politics.isDisplayed())
            politics.click();

        driver.findElement(By.id("welcome_btn_login")).click();
        driver.findElement(By.name("username")).sendKeys(username1);
        driver.findElement(By.name("password")).sendKeys(password1);
        driver.findElement(By.id("login_check_tos")).click();
        driver.findElement(By.id("login_btn_login")).click();

        TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.id("main_btn_myzone")).click();
        driver.findElement(By.id("activation_init_btn_confirm")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("activation_summary_checkbox")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("activation_summary_btn_confirm")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/input")).sendKeys("2222");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[3]/div[2]/span")).click();
        driver.quit();
    }

}
