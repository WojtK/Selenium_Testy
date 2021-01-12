import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


//przyklad zaladowania elementow do listy
//        List<WebElement> aktorzy = driver.findElements(By.cssSelector("[data-id=\"actor_root\"]"));
//domyślnie wyczyszczona przeglądarka
//        WebDriver driver = new FirefoxDriver();
//        WebDrive driver = new ChromeDriver();
//zaladowanie przygotowanego wczesniej profilu dla firefox
      /*  File file = new File("cors_everywhere-18.11.13.2043-fx.xpi");
        ProfilesIni profi = new ProfilesIni();
        FirefoxProfile Fireprofile = profi.getProfile("Test");
        //Fireprofile.addExtension(file);
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(Fireprofile);

        WebDriver driver = new FirefoxDriver(option);*/


public class Selenium

{
    String username = "9999999088";
    String password = "4365";
    String username1 = "9999900019";
    String password1 = "0019";

/*
    @Test
   // @Given
    public void Test1() throws IOException, InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://tvgo.orange.pl/");

        Logging.Log_In(driver,username,password);

        Screenshoot.Screenshoot(driver,"SCR-Login");
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");
      //  driver.findElement(By.className("icon-cloud-recording"));

        driver.quit();
    }

    @Test
    public void MyDevices() throws IOException, InterruptedException {

        //domyślnie wyczyszczona przeglądarka
        //WebDriver driver = new FirefoxDriver();
        File file = new File("cors_everywhere-18.11.13.2043-fx.xpi");
        ProfilesIni profi = new ProfilesIni();
        FirefoxProfile Fireprofile = profi.getProfile("Test");
        //Fireprofile.addExtension(file);
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(Fireprofile);

        WebDriver driver = new FirefoxDriver(option);
        driver.manage().window().maximize();
        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/");

        TimeUnit.SECONDS.sleep(10);

        Logging.Log_In(driver,username1,password1);

        Screenshoot.Screenshoot(driver,"SCR-Login");

        driver.get("https://devfrontendtv.sdqac.rd.tp.pl/settings/about_application");
        //List<WebElement> emisje = driver.findElements(By.className("broadcasts-box"));
        //List<WebElement> emisje = driver.findElements(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div/div[7]/div[3]/div[1]/div"));
        // List<WebElement> emisje = driver.findElements(By.cssSelector("[data-id=\"live_broadcast_frame\"]"));
        // List<WebElement> aktorzy = driver.findElements(By.cssSelector("[data-id=\"actor_root\"]"));

        driver.findElement(By.id("about-app-accordion-heading-2")).click();
        //aktorzy.get(4).click();
        // driver.findElement(By.id("buttonRight_actor")).click();
        TimeUnit.SECONDS.sleep(15);
        Logging.Log_out(driver);
        TimeUnit.SECONDS.sleep(3);
        Screenshoot.Screenshoot(driver,"SCR-Logout");
        //  driver.findElement(By.className("icon-cloud-recording"));

        driver.quit();
    }
*/

    public static void main(String[] args) throws InterruptedException, IOException {
        PrintWriter writer = new PrintWriter(new File("./logfile2.log"));
        writer.print("");
        writer.close();

       // org.slf4j.Logger logger = LoggerFactory.getLogger(Selenium.class);
       // logger.info("Hello World");

        Logger log = Logger.getRootLogger();
        new YPT_7507().AboutApplication();
        new YPT_7507().AboutApplication();
        Result result = JUnitCore.runClasses(Starter.class);
    }

}