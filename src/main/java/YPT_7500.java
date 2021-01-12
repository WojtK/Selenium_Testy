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

public class YPT_7500 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    @Test
    public void First_Banner() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/list");

        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("vods_top_banner_image")).click();
        TimeUnit.SECONDS.sleep(3);

        driver.quit();
    }

    @Test
    public void VOD_Categories() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/list");


        driver.findElement(By.id("vodCategoriesDropdown")).click();

        List<WebElement> categories = driver.findElements(By.id("vods_category_droplist_entry_name"));
        //  categories.get(3).click();
        for(int i =0; i < categories.size(); i++){
            System.out.println(categories.get(i).getText());
        }
        for(int i = 0; i < categories.size(); i++)
        {
            if((categories.get(i).getText().toLowerCase()).equals("fantastyka"))
            {
                categories.get(i).click();
            }
        }
        // driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[1]/div/div/ul/li[7]")).click();
        System.out.println(driver.findElement(By.id("vodCategoriesDropdown")).getText());
        TimeUnit.SECONDS.sleep(5);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }

    @Test
    public void Category_Text() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/vod/list");

        System.out.println(driver.findElement(By.id("vodCategoriesDropdown")).getText());
        TimeUnit.SECONDS.sleep(1);
        TimeUnit.SECONDS.sleep(1);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(1);
        Screenshoot.Screenshoot(driver,"SCR-Logout");

        driver.quit();
    }




}
