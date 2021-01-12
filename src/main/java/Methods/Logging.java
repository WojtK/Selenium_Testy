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

              WebElement politics = driver.findElement(By.className("btn-accept"));

              if (politics.isDisplayed())
                     politics.click();

              driver.findElement(By.id("welcome_btn_login")).click();
              //driver.findElement(By.id("")).click();
              driver.findElement(By.name("username")).sendKeys(username);
              driver.findElement(By.name("password")).sendKeys(password);
              driver.findElement(By.id("login_check_tos")).click();
              driver.findElement(By.id("login_btn_login")).click();
              TimeUnit.SECONDS.sleep(2);
              driver.findElement(By.id("profile_chooser_image_frame")).click();
           //   TimeUnit.SECONDS.sleep(2);

              boolean parental = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div/input")).size() > 0;
              if (parental) {
                     driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div/input")).sendKeys("2222");
                     driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[3]/div[2]/span")).click();
              }
           //   TimeUnit.SECONDS.sleep(2);
       }

       public static void Log_out(WebDriver driver) throws InterruptedException {
          driver.findElement(By.id("epgChannelCategoriesDropdown")).click();
       //   TimeUnit.SECONDS.sleep(2);
          driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/header/div[2]/div[4]/div/ul/div[6]")).click();
       }

}
