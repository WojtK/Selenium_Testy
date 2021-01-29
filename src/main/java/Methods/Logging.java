package Methods;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

//dorzucic loggera do tych prawdziwych testow 'import org.apache.log4j.Logger;'
//klasa YPT_7507 jest pokryta loggerami
public class Logging {

       public static Logger log = Logger.getRootLogger();

       public static void Log_In(WebDriver driver,String username,String password) throws InterruptedException {
              TimeUnit.SECONDS.sleep(1);
              WebElement politics = driver.findElement(By.className("btn-accept"));

              if (politics.isDisplayed())
                     politics.click();
              TimeUnit.SECONDS.sleep(2);
             // driver.findElement(By.cssSelector("[data-id='welcome_btn_login']")).click();
              driver.findElement(By.id("welcome_btn_login")).click();
              //driver.findElement(By.id("")).click();
              driver.findElement(By.name("username")).sendKeys(username);
              driver.findElement(By.name("password")).sendKeys(password);
              driver.findElement(By.id("login_check_tos")).click();
              driver.findElement(By.id("login_btn_login")).click();
              TimeUnit.SECONDS.sleep(2);
              driver.findElement(By.id("profile_chooser_image_frame")).click();
           //   TimeUnit.SECONDS.sleep(2);

              boolean parental = driver.findElements(By.id("parental_dialog_title")).size() > 0;
              if (parental) {
                     driver.findElement(By.id("parental_dialog_input")).sendKeys("1111");
                     driver.findElement(By.id("parental_dialog_btn_accept")).click();
              }
           //   TimeUnit.SECONDS.sleep(2);
       }

       public static void Log_out(WebDriver driver) throws InterruptedException {
          driver.findElement(By.id("epgChannelCategoriesDropdown")).click();
       //   TimeUnit.SECONDS.sleep(2);
          driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/header/div[2]/div[4]/div/ul/div[4]")).click();
       }

}
