import Methods.Logging;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7518 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/YPT-7518/landing_page";



    @Test
    public void Newsletter() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.id("main_btn_myzone")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("myzone_newsletter_banner_image")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("newsletter_field_email")).sendKeys("test@orange.com");
        driver.findElement(By.id("newsletter_check_tos")).click();
        driver.findElement(By.id("newsletter_check_rodo")).click();
        driver.findElement(By.id("newsletter_rodo_more_btn")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("newsletter_check_tos")).click();
        driver.findElement(By.id("newsletter_check_rodo")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("newsletter_btn_save")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }

}
