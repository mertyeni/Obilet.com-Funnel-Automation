package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.awt.dnd.Autoscroll;
import java.util.Iterator;
import java.util.Set;

import static contant.BaseContant.*;

public class test extends BaseMethod {


    @BeforeMethod
    public void beforeMethod() {
        setUp();
    }

    @Test // Flight - Funnel
    public void testFlight() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        click(FLIGHT_BUTTON);
        Thread.sleep(2000);
        click(FIRSTALLOW);
        Thread.sleep(1000);
        click(DATE_BUTTON);
        Thread.sleep(2000);
        click(DATE_DAY);
        Thread.sleep(4000);
        click(SEARCH_BUTTON);
        Thread.sleep(8000);
        click(POPUP_CLOSE);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 800);");
        Thread.sleep(1500);
        click(DETAILS);
        Thread.sleep(2000);
        click(FARELIST);
        Thread.sleep(8000);
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
        // Sayfayı en alta kaydırma işlemi
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        click(OVERALLPRICE);
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        // Sayfayı geri yukarıya kaydırma
        js.executeScript("window.scrollTo(0, 0);"); //
        Thread.sleep(1000);
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




    @Test // BusTR - Funnel
    public void testBus() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        click(FIRSTALLOW);
        Thread.sleep(1000);
        sendKeys(ORIGIN_BUTTON, "Bucak");
        Thread.sleep(3000);
        click(BUSORIGINID);
        Thread.sleep(1000);
        sendKeys(DESTINATION_BUTTON, "İzmir");
        Thread.sleep(3000);
        click(BUSDESTINATIONID);
        Thread.sleep(1000);
        click(BUSDATEBUTTON);
        Thread.sleep(2000);
        click(BUSDATEDAY);
        Thread.sleep(4000);
        click(SEARCH_BUTTON);
        Thread.sleep(10000);
        js.executeScript("window.scrollTo(0, 300);");
        Thread.sleep(1500);
        click(BUSDETAILS);
        Thread.sleep(5500);
        click(CHOOSESEAT);
        Thread.sleep(2000);
        click(CHOOSEGENDER);
        Thread.sleep(2000);
        click(CONFIRMJOURNEY);
        Thread.sleep(6000);
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        sendKeys(CHECKOUTNAME, "Mert Yeni");
        Thread.sleep(1000);
        sendKeys(CHECKOUTNATIONALID, "55972064536");
        Thread.sleep(1000);
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


    @Test // Otel Funnel
    public void testOtel() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        click(OTELBUTTON);
        Thread.sleep(1000);
        click(FIRSTALLOW);
        Thread.sleep(1000);
        click(ORIGIN_BUTTON);
        Thread.sleep(3000);
        click(OTELORIGINID);
        Thread.sleep(1000);
        click(OTELDEPARTUREINPUT);
        Thread.sleep(1000);
        click(OTELENTERDATE);
        Thread.sleep(1000);
        click(OTELOUTDATE);
        Thread.sleep(1000);
        click(PAXTOGGLE);
        Thread.sleep(1000);
        click(REMOVETOGGLE);
        Thread.sleep(1000);
        click(SEARCH_BUTTON);
        Thread.sleep(10000);
        js.executeScript("window.scrollTo(0, 150);");
        click(QUICKFILTER1);
        Thread.sleep(1000);
        click(OTELSELECT);
        Thread.sleep(8000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String firstWindowHandle = iterator.next();
        String secondWindowHandle = iterator.next();
        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(1000);
        click(OTELPOPUPCLOSE);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 600);");
        Thread.sleep(1500);
        click(OTELGOTOROOM);
        Thread.sleep(12000);
        sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE, "5063637195");
        Thread.sleep(1000);
        click(SMSAPPROVE);
        Thread.sleep(1000);
        // Sayfayı en alta kaydırma işlemi
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
        // Sayfayı geri yukarıya kaydırma
        js.executeScript("window.scrollTo(0, 0);"); //
        Thread.sleep(1500);
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


    @Test // Ferry funnel
        public void testFerry() throws InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            click(FERRYBUTTON);
            Thread.sleep(1000);
            click(FIRSTALLOW);
            Thread.sleep(1000);
            click(DATE_BUTTON);
            Thread.sleep(2000);
            click(DATE_DAY);
            Thread.sleep(4000);
            click(SEARCH_BUTTON);
            Thread.sleep(8000);
            js.executeScript("window.scrollTo(0, 400);");
            Thread.sleep(1500);
            click(FERRYJOURNEYSELECT);
            Thread.sleep(1000);
            click(FERRYFARESELECT);
            Thread.sleep(2200);
            click(FERRYSEATSELECT);
            Thread.sleep(2000);
            click(FERRYCONFIRMJOURNEY);
            Thread.sleep(10000);
            sendKeys(INPUTEMAIL, "mert.yeni@obilet.com");
            Thread.sleep(1000);
            sendKeys(INPUTPHONE, "5063637195");
            Thread.sleep(1000);
            sendKeys(FERRYINPUTNAME,"Mert Yeni");
            Thread.sleep(1000);
            sendKeys(FERRYINPUTGOVID,"55972064536");
            Thread.sleep(800);
            click(FERRYBIRTHDAY);
            Thread.sleep(1000);
            click(FERRYBIRTHMONTH);
            Thread.sleep(1000);
            click(FERRYBIRTHYEAR);
            Thread.sleep(1000);
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
            click(FERRYCONFIRMCOOKIE);
            Thread.sleep(1000);












    }













    @AfterMethod
    public void afterMethod() {
    tearDown();
    }
    }


