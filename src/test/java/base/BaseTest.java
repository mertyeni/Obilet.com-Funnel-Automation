package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    public void takeScreenshotOnFailure(String testName) {
        if (driver != null) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Path destPath = Paths.get(System.getProperty("user.dir"), "target", "screenshots", testName + ".png");
                Files.createDirectories(destPath.getParent());
                Files.copy(screenshot.toPath(), destPath, StandardCopyOption.REPLACE_EXISTING);
                Allure.addAttachment("Screenshot", new FileInputStream(destPath.toFile()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Driver is null. Cannot take a screenshot.");
        }
    }
    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot();
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}