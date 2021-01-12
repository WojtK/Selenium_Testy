import Methods.Logging;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class YPT_7523 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";



    @Test
    public void EPG() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("main_btn_myzone")).click();

        System.out.println(driver.findElement(By.id("myzone_info_section_value")).getText());
        // driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[1]/div/div/ul/li[7]")).click();

        driver.quit();
    }

}
