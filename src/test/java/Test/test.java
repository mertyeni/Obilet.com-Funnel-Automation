package Test;

import method.BaseMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    }

    @AfterMethod
    public void afterMethod() {
    tearDown();
    }
}
