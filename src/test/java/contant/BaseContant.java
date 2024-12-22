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
    public static final By DETAILS=By.xpath("//*[@id=\"journey-SAW-ADB-20250102--1006PC--1006PC-2184-1\"]");
    public static final By FARELIST=By.cssSelector("#journey-SAW-ADB-20250102--1006PC--1006PC-2184-1 > div.details.row > ul > li > ul > li:nth-child(1) > div > div > div.price > div > div.amount.notranslate");
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
    public static final By INPUTCARDNUMBER=By.id("card-number");
    public static final By INPUTCARDEXP=By.id("card-expiration");
    public static final By INPUTCARDCVC=By.id("card-csc");
    public static final By OVERALLPRICE=By.xpath("//*[@id=\"prices-mid\"]/table/tbody/tr/td[1]");
    public static final By INSTALLEMENTOPTIONS=By.xpath("//*[@id=\"installment-other-toggle\"]/div");
    public static final By INSTALLEMENT=By.xpath("//*[@id=\"installment-html\"]/ul/li[5]/label");


    // BUS
    public static final By BUSORIGINID=By.xpath("//*[@id=\"origin\"]/div[2]/ul/li[1]");
    public static final By BUSDESTINATIONID=By.xpath("//*[@id=\"destination\"]/div[2]/ul/li[1]");
    public static final By BUSDATEBUTTON=By.xpath("//*[@id=\"departure\"]/div[1]/div[1]");
    public static final By BUSDATEDAY=By.xpath("//*[@id=\"departure\"]/div[3]/div/div[2]/div/table/tbody/tr[4]/td[3]/button/span");
    public static final By BUSDETAILS=By.xpath("//*[@id=\"journey-916659744\"]/div[1]");
    public static final By CHOOSESEAT=By.xpath("//*[@id=\"journey-916659744\"]/div[2]/div[2]/div[2]/div[1]/div[1]/svg/a[21]/use");
    public static final By CHOOSEGENDER=By.xpath("//*[@id=\"main\"]/div[11]/div/button[1]");
    public static final By CONFIRMJOURNEY=By.xpath("//*[@id=\"journey-916659744\"]/div[2]/div[2]/div[2]/div[2]/button");



}

