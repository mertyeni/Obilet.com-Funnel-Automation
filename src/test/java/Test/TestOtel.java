package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import io.qameta.allure.Step;

import java.util.Iterator;
import java.util.Set;

import static contant.BaseContant.*;

public class TestOtel extends BaseMethod {

    @BeforeMethod
    public void beforeMethod() {
        setUp();
    }

    @Test(description = "Otel Funnel")
    public void testOtel() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        navigateToHotels();
        selectHotelLocation();
        selectHotelDates();
        configurePax();
        searchHotels();
        applyFiltersAndSelectHotel(js);
        switchToHotelWindow();
        viewRoomDetails(js);
        fillContactInformation();
        fillPassengerInformation(js);
        fillPaymentInformation();
    }

    @Step("Navigate to Hotels section")
    public void navigateToHotels() throws InterruptedException {
        click(OTELBUTTON);
        Thread.sleep(1000);
        click(FIRSTALLOW);
        Thread.sleep(1000);
    }

    @Step("Select hotel location")
    public void selectHotelLocation() throws InterruptedException {
        click(ORIGIN_BUTTON);
        Thread.sleep(3000);
        click(OTELORIGINID);
        Thread.sleep(1000);
    }

    @Step("Select check-in and check-out dates")
    public void selectHotelDates() throws InterruptedException {
        click(OTELDEPARTUREINPUT);
        Thread.sleep(1000);
        click(OTELENTERDATE);
        Thread.sleep(1000);
        click(OTELOUTDATE);
        Thread.sleep(1000);
    }

    @Step("Configure passenger details")
    public void configurePax() throws InterruptedException {
        click(PAXTOGGLE);
        Thread.sleep(1000);
        click(REMOVETOGGLE);
        Thread.sleep(1000);
    }

    @Step("Search for available hotels")
    public void searchHotels() throws InterruptedException {
        click(SEARCH_BUTTON);
        Thread.sleep(8000);
    }

    @Step("Apply quick filters and select a hotel")
    public void applyFiltersAndSelectHotel(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, 150);");
        click(QUICKFILTER1);
        Thread.sleep(1000);
        click(OTELSELECT);
        Thread.sleep(8000);
    }

    @Step("Switch to hotel details window")
    public void switchToHotelWindow() throws InterruptedException {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String firstWindowHandle = iterator.next();
        String secondWindowHandle = iterator.next();
        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(1000);
        click(OTELPOPUPCLOSE);
        Thread.sleep(2000);
    }

    @Step("View room details")
    public void viewRoomDetails(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, 1000);");
        Thread.sleep(3500);
        click(OTELGOTOROOM);
        Thread.sleep(12000);
    }

    @Step("Fill contact information")
    public void fillContactInformation() throws InterruptedException {
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        click(SMSAPPROVE);
        Thread.sleep(1000);
    }

    @Step("Fill passenger information")
    public void fillPassengerInformation(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1500);
        sendKeys(OTELFIRSTNAME, "Mert");
        Thread.sleep(1000);
        sendKeys(OTELLASTNAME, "Yeni");
        Thread.sleep(1000);
        sendKeys(OTELNATIONALID, "55972064536");
        Thread.sleep(1000);
        click(OTELGENDERCHECK);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1500);
    }

    @Step("Fill payment information")
    public void fillPaymentInformation() throws InterruptedException {
        sendKeys(INPUTCARDNUMBER, "4111");
        sendKeys(INPUTCARDNUMBER, "1111");
        sendKeys(INPUTCARDNUMBER, "1111");
        sendKeys(INPUTCARDNUMBER, "1111");
        Thread.sleep(1000);
        sendKeys(INPUTCARDEXP, "01");
        sendKeys(INPUTCARDEXP, "25");
        Thread.sleep(1000);
        sendKeys(INPUTCARDCVC, "001");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void afterMethod() {
        tearDown();
    }
}
