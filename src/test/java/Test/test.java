package Test;

import method.BaseMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.dnd.Autoscroll;

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
        Thread.sleep(15000);
        click(POPUP_CLOSE);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 800);");
        Thread.sleep(1500);
        click(DETAILS);
        Thread.sleep(2000);
        click(FARELIST);
        Thread.sleep(8000);
        sendKeys(INPUTEMAIL,"mert.yeni@obilet.com");
        Thread.sleep(1000);
        sendKeys(INPUTPHONE,"5063637195");
        Thread.sleep(1000);
        sendKeys(INPUTFIRSTNAME,"Mert");
        Thread.sleep(1000);
        sendKeys(INPUTLASTNAME,"Yeni");
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
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        sendKeys(INPUTCARDNUMBER,"4111");
        sendKeys(INPUTCARDNUMBER,"1111");
        sendKeys(INPUTCARDNUMBER,"1111");
        sendKeys(INPUTCARDNUMBER,"1111");
        Thread.sleep(1000);
        sendKeys(INPUTCARDEXP,"01");
        sendKeys(INPUTCARDEXP,"25");
        Thread.sleep(1000);
        sendKeys(INPUTCARDCVC,"001");
        Thread.sleep(1000);

        //click(INSTALLEMENTOPTIONS);
        //Thread.sleep(1000);
        //click(INSTALLEMENT);



    }

    @Test  // BusTR - Funnel
    public void testBus() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        click(FIRSTALLOW);
        Thread.sleep(1000);
        sendKeys(ORIGIN_BUTTON,"Bucak");
        Thread.sleep(3000);
        click(BUSORIGINID);
        Thread.sleep(1000);
        sendKeys(DESTINATION_BUTTON,"İzmir");
        Thread.sleep(3000);
        click(BUSDESTINATIONID);
        Thread.sleep(1000);
        click(BUSDATEBUTTON);
        Thread.sleep(2000);
        click(BUSDATEDAY);
        Thread.sleep(4000);
        click(SEARCH_BUTTON);
        Thread.sleep(8000);
        js.executeScript("window.scrollTo(0, 300);");
        Thread.sleep(1500);
        click(BUSDETAILS);
        /*Thread.sleep(5500);
        click(CHOOSESEAT);
        Thread.sleep(2000);
        click(CHOOSEGENDER);
        Thread.sleep(2000);
        click(CONFIRMJOURNEY);
        Thread.sleep(10000);
        */
    }
    @AfterMethod
    public void afterMethod() {
    tearDown();
    }
}
