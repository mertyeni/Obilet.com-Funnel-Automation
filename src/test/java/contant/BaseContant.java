package contant;

import org.openqa.selenium.By;



public class BaseContant {
     // FLIGHT
    public static final By FLIGHT_BUTTON= By.cssSelector("[data-event-action='Flight']");
    public static final By ORIGIN_BUTTON= By.id("origin-input");
    public static final By DESTINATION_BUTTON= By.id("destination-input");
    public static final By RETURNSELECT=By.id("two-ways");
    public static final By RETURNDATEBUTTON=By.xpath("//*[@id=\"search\"]/div[2]/div[4]");
    public static final By RETURNDATE_DAY=By.xpath("//*[@id=\"return\"]/div[2]/div[1]/div[2]/div/table/tbody/tr[4]/td[5]/button");
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
    public static final By BUSDETAILS=By.xpath("//*[@id=\"journey-1073289730\"]/div[1]");
    public static final By CHOOSESEAT=By.cssSelector("#journey-1073289730 > div.details.details-container.row > div.journey-details-template > div.next > div.layout.layout-sun-left > div.wrapper > svg > a:nth-child(59) > text");
    public static final By CHOOSEGENDER=By.xpath("//*[@id=\"main\"]/div[11]/div/button[1]");
    public static final By CONFIRMJOURNEY=By.xpath("//*[@id=\"journey-1073289730\"]/div[2]/div[2]/div[2]/div[2]/button/span[1]");
    public static final By CHECKOUTNAME=By.xpath("//*[@id=\"name-42\"]");
    public static final By CHECKOUTNATIONALID=By.xpath("//*[@id=\"gov-id-42\"]");
    public static final By LISTCLOSEPOPUP=By.cssSelector("#close-button-1454703513200 > svg > path");






    //OTEL
    public static final By OTELBUTTON=By.cssSelector("[data-event-action='Hotel']");
    public static final By OTELORIGINID=By.xpath("//*[@id=\"origin\"]/div/ul[1]/li[3]");
    public static final By OTELDEPARTUREINPUT=By.id("departure-input");
    public static final By OTELENTERDATE=By.xpath("//*[@id=\"checkInDate\"]/div[3]/div/div[2]/table[1]/tbody[2]/tr[5]/td[3]/button");
    public static final By OTELOUTDATE=By.xpath("//*[@id=\"checkInDate\"]/div[3]/div/div[2]/table[1]/tbody[2]/tr[5]/td[6]/button");
    public static final By PAXTOGGLE=By.id("pax-toggle");
    public static final By REMOVETOGGLE=By.xpath("//*[@id=\"pax-container\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]");
    public static final By QUICKFILTER1=By.xpath("//*[@id=\"quickFiltersContainer\"]/div/div[2]/button[1]");
    public static final By OTELSELECT=By.xpath("//*[@id=\"outbound-journeys\"]/li[2]/div/div[3]");
    public static final By OTELPOPUPCLOSE=By.cssSelector("#modal-content > div.hotel-coupon-modal__close-btn > svg > use");
    public static final By OTELGOTOROOM=By.xpath("//*[@id=\"hotelRoomOffersTemplateContainer\"]/div/div[3]/div/div[2]/button");
    public static final By OTELFIRSTNAME=By.id("first-name-0");
    public static final By OTELLASTNAME=By.id("last-name-0");
    public static final By OTELNATIONALID=By.id("gov-id-0");
    public static final By OTELGENDERCHECK=By.xpath("//*[@id=\"male-0\"]/div");
    public static final By CLICKCONTRATOPTION=By.xpath("//*[@id=\"contract-optin\"]/div");
    public static final By SMSAPPROVE=By.xpath("//*[@id=\"subscription-optin\"]/div[1]");





    // FERRY
    public static final By FERRYBUTTON=By.cssSelector("[data-event-action='Sea']");
    public static final By FERRYJOURNEYSELECT=By.xpath("//*[@id=\"journey-584117\"]/div[1]/div[2]");
    public static final By FERRYFARESELECT=By.xpath("//*[@id=\"journey-584117\"]/div[2]/div[2]/ul/li[1]/div/div[2]");
    public static final By FERRYSEATSELECT=By.cssSelector("#journey-584117 > div.details.details-container.row > div:nth-child(2) > div.next > div.layout > div.wrapper > div > svg > a:nth-child(177)");
    public static final By FERRYCONFIRMJOURNEY=By.xpath("//*[@id=\"journey-584117\"]/div[2]/div[2]/div[1]/div[2]/button/span[1]");
    public static final By FERRYINPUTNAME=By.id("name-165");
    public static final By FERRYINPUTGOVID=By.id("gov-id-165");
    public static final By FERRYBIRTHDAY=By.xpath("//*[@id=\"birth-day-165\"]/option[24]");
    public static final By FERRYBIRTHMONTH=By.xpath("//*[@id=\"birth-month-165\"]/option[11]");
    public static final By FERRYBIRTHYEAR=By.xpath("//*[@id=\"birth-year-165\"]/option[12]");
    public static final By FERRYCONFIRMCOOKIE=By.xpath("//*[@id=\"contract-optin\"]/div");



}

