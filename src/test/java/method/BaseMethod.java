package method;



import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class BaseMethod extends BaseTest {


    public void click(By locator) {
        if (driver != null) {
            WebElement element = driver.findElement(locator);
            element.click();
        }
    }
    public void sendKeys(By locator, String text) {
        if (driver != null) {
            WebElement element = driver.findElement(locator);
            element.sendKeys(text);}

    }


}
