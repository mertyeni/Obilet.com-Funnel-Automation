package Test;

import method.BaseMethod;
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

    @Test
    public void testFlight() throws InterruptedException {
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
        Thread.sleep(2000);
        click(INPUTBIRTHMONTH);
        Thread.sleep(2000);
        click(INPUTBIRTHYEAR);
        Thread.sleep(2000);
        sendKeys(INPUTNATIONALID, "55972064536");
        Thread.sleep(1000);
        click(MALECHECK);




    }

    @AfterMethod
    public void afterMethod() {
    tearDown();
    }
}
