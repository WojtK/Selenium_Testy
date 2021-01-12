import Methods.Logging;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class YPT_7517 {

    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900018";
    String password1 = "0018";
    String url = "https://devfrontendtv.sdqac.rd.tp.pl/landing_page";


    //udaje sie zlapac tylko widoczne elementy. Trzeba popracowac nad
    // przesuwaniem i dodawaniem pozycji na liscie i ujednoliceniem
    // zbioru (set)
    @Test
    public void KO() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);


        Logging.Log_In(driver,username1,password1);

        TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.id("main_btn_myzone")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.id("main_btn_myzone")).click();
        TimeUnit.SECONDS.sleep(3);
        WebElement KO = driver.findElement(By.id("slideBox_cont-watching"));
        List<WebElement> cont = KO.findElements(By.id("myzone_item_name"));
      //  Set<WebElement> set = new HashSet<>(cont);
        Set target = Set.copyOf(cont);
        TimeUnit.SECONDS.sleep(5);
        Iterator<WebElement> it = target.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
        for(int i =0; i < cont.size(); i++){
            System.out.println(cont.get(i).getText());
        }
        TimeUnit.SECONDS.sleep(2);

        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }

}
