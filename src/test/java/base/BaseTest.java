
package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
   public WebDriver driver;


    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions());
        driver.manage().window().maximize();
        driver.get("https://www.obilet.com");
    }
    public ChromeOptions chromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--kiosk");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--maximize");
        return chromeOptions;
    }

    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }



    }
}
