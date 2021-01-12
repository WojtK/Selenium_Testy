package Methods;

import org.openqa.selenium.WebDriver;

public class BeforeClass {

    static String url = "https://devfrontendtv.sdqac.rd.tp.pl/";

    public static WebDriver Start()
    {
        WebDriver driver = Methods.WebDriver.NewDriver("Firefox");
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
