package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.*;
import io.qameta.allure.Step;

import static contant.BaseContant.*;

public class TestBus extends BaseMethod {

    @BeforeMethod
    public void beforeMethod() {
        setUp();
    }

    @Test(description = "BusTR - Funnel") // Test açıklaması Allure raporlarına eklenecek
    public void testBus() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        allowFirstPopup();
        selectBusRoute("Bucak", "İzmir");
        selectBusDate();
        searchBus();
        viewBusDetails(js);
        selectSeatAndConfirm();
        fillPassengerInformation();
        fillPaymentInformation();
    }

    @Step("Allow the first popup to proceed")
    public void allowFirstPopup() throws InterruptedException {
        click(FIRSTALLOW);
        Thread.sleep(1000);
    }

    @Step("Select bus route from {origin} to {destination}")
    public void selectBusRoute(String origin, String destination) throws InterruptedException {
        sendKeys(ORIGIN_BUTTON, origin);
        Thread.sleep(3000);
        click(BUSORIGINID);
        Thread.sleep(1000);
        sendKeys(DESTINATION_BUTTON, destination);
        Thread.sleep(3000);
        click(BUSDESTINATIONID);
        Thread.sleep(1000);
    }

    @Step("Select the bus travel date")
    public void selectBusDate() throws InterruptedException {
        click(BUSDATEBUTTON);
        Thread.sleep(2000);
        click(BUSDATEDAY);
        Thread.sleep(3000);
    }

    @Step("Search for buses")
    public void searchBus() throws InterruptedException {
        click(SEARCH_BUTTON);
        Thread.sleep(7000);
    }

    @Step("View details of the selected bus")
    public void viewBusDetails(JavascriptExecutor js) throws InterruptedException {
        js.executeScript("window.scrollTo(0, 300);");
        Thread.sleep(1500);
        click(BUSDETAILS);
        Thread.sleep(5500);
    }

    @Step("Select a seat and confirm the journey")
    public void selectSeatAndConfirm() throws InterruptedException {
        click(CHOOSESEAT);
        Thread.sleep(2000);
        click(CHOOSEGENDER);
        Thread.sleep(2000);
        click(CONFIRMJOURNEY);
        Thread.sleep(6000);
    }

    @Step("Fill in passenger information")
    public void fillPassengerInformation() throws InterruptedException {
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        sendKeys(CHECKOUTNAME, "Mert Yeni");
        Thread.sleep(1000);
        sendKeys(CHECKOUTNATIONALID, "55972064536");
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
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot();
        }
        tearDown();
    }
}
