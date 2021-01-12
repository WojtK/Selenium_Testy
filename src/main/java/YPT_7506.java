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

public class YPT_7506 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";


    @Test
    public void AboutAccount() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/about_account");

        System.out.println(driver.findElement(By.id("about_account_id_layout")).getText());
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"About account");
        System.out.println(driver.findElement(By.id("about_account_npvr_layout")).getText());
        System.out.println(driver.findElement(By.id("about_account_services_off_layout")).getText());
        System.out.println(driver.findElement(By.id("about_account_balance_layout")).getText());
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    //Dodac id buttona
    @Test
    public void CodeQR() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/qr");

        Screenshoot.Screenshoot(driver,"Before_QR");
        driver.findElement(By.id("qr_generate_btn")).click();
        TimeUnit.SECONDS.sleep(2);
        Screenshoot.Screenshoot(driver,"After_QR");

        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void MyDevices() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/my_devices");

        List<WebElement> devices = driver.findElements(By.id("terminal_entry_name"));

        for (WebElement device: devices) {
            System.out.println(device.getText());
        }



        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

   // @Test
    public void Npvr() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/npvr");

        driver.findElement(By.id("npvr_btn")).click();

        Screenshoot.Screenshoot(driver,"NPVR");
        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void ParentalControl() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/parental_control");

        List<WebElement> parentialList = driver.findElements(By.id("parental_entry_check"));

        parentialList.get(1).click();
        TimeUnit.SECONDS.sleep(3);
        parentialList.get(parentialList.size()-1).click();
        TimeUnit.SECONDS.sleep(2);

        Screenshoot.Screenshoot(driver,"Regulamin");
        driver.findElement(By.id("parental_btn_save")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/input")).sendKeys("2222");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[3]/div[2]")).click();

        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void PaymentHistory() throws IOException, InterruptedException {



        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        TimeUnit.SECONDS.sleep(3);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/payment_history");
        
        List<WebElement> orders = driver.findElements(By.id("order_history_entry_frame"));

        for (WebElement i: orders)
        {
            System.out.println(i.getText());
        }
      //  System.out.println(driver.findElement(By.id("order_history_entry_frame")).getText());



        TimeUnit.SECONDS.sleep(3);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }


}
