package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import io.qameta.allure.Step;

import java.util.Iterator;
import java.util.Set;

import static contant.BaseContant.*;

public class TestFerry extends BaseMethod {

    @BeforeMethod
    public void beforeMethod() {
        setUp();
    }

    @Test // Ferry funnel
    public void testFerry() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        clickFerryButton();
        clickFirstAllow();
        selectDate();
        selectDay();
        searchJourney();
        scrollDown();
        selectFerryJourney();
        selectFerryFare();
        selectFerrySeat();
        confirmFerryJourney();
        enterUserDetails();
        enterCardDetails();
        confirmCookies();
    }

    @Step("Click Ferry Button")
    public void clickFerryButton() throws InterruptedException {
        click(FERRYBUTTON);
        Thread.sleep(1000);
    }

    @Step("Click First Allow Button")
    public void clickFirstAllow() throws InterruptedException {
        click(FIRSTALLOW);
        Thread.sleep(1000);
    }

    @Step("Click Date Button")
    public void selectDate() throws InterruptedException {
        click(DATE_BUTTON);
        Thread.sleep(2000);
    }

    @Step("Select Day")
    public void selectDay() throws InterruptedException {
        click(DATE_DAY);
        Thread.sleep(4000);
    }

    @Step("Click Search Button")
    public void searchJourney() throws InterruptedException {
        click(SEARCH_BUTTON);
        Thread.sleep(8000);
    }

    @Step("Scroll Down the Page")
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 400);");
        Thread.sleep(1500);
    }

    @Step("Select Ferry Journey")
    public void selectFerryJourney() throws InterruptedException {
        click(FERRYJOURNEYSELECT);
        Thread.sleep(1000);
    }

    @Step("Select Ferry Fare")
    public void selectFerryFare() throws InterruptedException {
        click(FERRYFARESELECT);
        Thread.sleep(2200);
    }

    @Step("Select Ferry Seat")
    public void selectFerrySeat() throws InterruptedException {
        click(FERRYSEATSELECT);
        Thread.sleep(2000);
    }

    @Step("Confirm Ferry Journey")
    public void confirmFerryJourney() throws InterruptedException {
        click(FERRYCONFIRMJOURNEY);
        Thread.sleep(10000);
    }

    @Step("Enter User Details (Email, Phone, Name, GOV ID)")
    public void enterUserDetails() throws InterruptedException {
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        sendKeys(FERRYINPUTNAME, "Mert Yeni");
        Thread.sleep(1000);
        sendKeys(FERRYINPUTGOVID, "55972064536");
        Thread.sleep(800);
        selectBirthday();
    }

    @Step("Select Birthday")
    public void selectBirthday() throws InterruptedException {
        click(FERRYBIRTHDAY);
        Thread.sleep(1000);
        click(FERRYBIRTHMONTH);
        Thread.sleep(1000);
        click(FERRYBIRTHYEAR);
        Thread.sleep(1000);
    }

    @Step("Enter Card Details (Card Number, Expiry, CVC)")
    public void enterCardDetails() throws InterruptedException {
        sendKeys(INPUTCARDNUMBER, "4111");
        sendKeys(INPUTCARDNUMBER, "1111");
        sendKeys(INPUTCARDNUMBER, "1111");
        sendKeys(INPUTCARDNUMBER, "1111");
        Thread.sleep(1000);
        sendKeys(INPUTCARDEXP, "01");
        sendKeys(INPUTCARDEXP, "25");
        Thread.sleep(1000);
        sendKeys(INPUTCARDCVC, "001");
        Thread.sleep(1000);
    }

    @Step("Click Confirm Cookies Button")
    public void confirmCookies() throws InterruptedException {
        click(FERRYCONFIRMCOOKIE);
        Thread.sleep(1000);
    }

    @AfterMethod
    public void afterMethod() {
        tearDown();
    }
}
