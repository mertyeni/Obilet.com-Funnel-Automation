package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.*;
import io.qameta.allure.Step;

import static contant.BaseContant.*;

public class TestFlight extends BaseMethod {

    @BeforeMethod
    public void beforeMethod() {
        setUp();
    }

    @Test // Flight - Funnel
    public void testFlight() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        clickFlightButton();
        allowFirstPopup();
        selectFlightDate();
        searchFlights();
        closePopup();
        scrollToDetailsSection(js);
        selectDetailsAndFare();
        fillPassengerInformation();
        scrollAndConfirmPrice(js);
        fillPaymentInformation();
    }

    @Step("Click on the flight button")
    public void clickFlightButton() throws InterruptedException {
        click(FLIGHT_BUTTON);
        Thread.sleep(2000);
    }

    @Step("Allow the first popup")
    public void allowFirstPopup() throws InterruptedException {
        click(FIRSTALLOW);
        Thread.sleep(1000);
    }

    @Step("Select flight date")
    public void selectFlightDate() throws InterruptedException {
        click(DATE_BUTTON);
        Thread.sleep(2000);
        click(DATE_DAY);
        Thread.sleep(4000);
    }

    @Step("Search for flights")
    public void searchFlights() throws InterruptedException {
        click(SEARCH_BUTTON);
        Thread.sleep(10000);
    }

   @Step("Close the popup")
   public void closePopup() throws InterruptedException {
       click(POPUP_CLOSE);
        Thread.sleep(2000);
    }

    @Step("Scroll to the details section")
    public void scrollToDetailsSection(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, 1850);");
        Thread.sleep(1500);
    }

    @Step("Select details and fare list")
    public void selectDetailsAndFare() throws InterruptedException {
        click(DETAILS);
        Thread.sleep(2000);
        click(FARELIST);
        Thread.sleep(8000);
    }

    @Step("Fill in passenger information")
    public void fillPassengerInformation() throws InterruptedException {
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        sendKeys(INPUTFIRSTNAME, "Mert");
        Thread.sleep(1000);
        sendKeys(INPUTLASTNAME, "Yeni");
        Thread.sleep(1000);
        click(INPUTBIRTHDAY);
        Thread.sleep(1200);
        click(INPUTBIRTHMONTH);
        Thread.sleep(1200);
        click(INPUTBIRTHYEAR);
        Thread.sleep(1200);
        sendKeys(INPUTNATIONALID, "55972064536");
        Thread.sleep(1000);
        click(MALECHECK);
        Thread.sleep(1000);
    }

    @Step("Scroll to the bottom and confirm price")
    public void scrollAndConfirmPrice(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        click(OVERALLPRICE);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
    }

    @Step("Fill in payment information")
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
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE || result.getStatus() == ITestResult.SKIP) {
            takeScreenshotOnFailure(result.getName());
        }
        tearDown();
    }
    }


