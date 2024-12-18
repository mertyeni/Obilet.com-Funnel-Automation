package contant;

import org.openqa.selenium.By;


public class BaseContant {

    public static final By FLIGHT_BUTTON= By.cssSelector("[data-event-action='Flight']");
    public static final By ORIGIN_BUTTON= By.id("origin-input");
    public static final By DESTINATION_BUTTON= By.id("destination-input");
    public static final By SEARCH_BUTTON= By.id("search-button");
    public static final By DATE_BUTTON= By.xpath("//*[@id=\"search\"]/div[2]/div[3]/div");
    public static final By DATE_DAY= By.xpath("//*[@id=\"departure\"]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[4]/button");
    public static final By POPUP_CLOSE= By.xpath("//*[@id=\"close-button-1454703513200\"]/span");
    public static final By DETAILS=By.xpath("//*[@id=\"journey-IST-ADB-20250102--1000TK--1000TK-TK2312-1\"]");
    public static final By FARELIST=By.cssSelector("#journey-IST-ADB-20250102--1000TK--1000TK-TK2312-1 > div.details.row > ul > li > ul > li:nth-child(1) > div > div");
    public static final By FIRSTALLOW=By.id("accept");
    public static final By INPUTEMAIL=By.id("email");
    public static final By INPUTPHONE=By.id("phone");
    public static final By INPUTFIRSTNAME=By.id("first-name-1");
    public static final By INPUTLASTNAME=By.id("last-name-1");
    public static final By INPUTBIRTHDAY=By.xpath("//*[@id=\"birth-day-1\"]/option[24]");
    public static final By INPUTBIRTHMONTH=By.xpath("//*[@id=\"birth-month-1\"]/option[11]");
    public static final By INPUTBIRTHYEAR=By.xpath("//*[@id=\"birth-year-1\"]/option[12]");
    public static final By INPUTNATIONALID=By.id("gov-id-1");
    public static final By MALECHECK=By.xpath("//*[@id=\"male-1\"]/div");
    public static final By LASTPRICE=By.xpath("//*[@id=\"prices-mid\"]/table/tbody/tr/td[1]");

}

