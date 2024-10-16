package com.enuygun.pageobjects.locators;

import org.openqa.selenium.By;

public class SelectTicketLocators {

    public static final By fieldAramayiFavorilereEkle = By.xpath("//div[@data-testid='flight-favorite-search']");
    public static final By selectTarihFilter = By.xpath("//div[@class='ctx-filter-departure-return-time card-header']");
    public static final String sliderTarihLeft = ("(//div[contains(@role,'slider')])[1]");
    public static final String sliderTarihRight =("(//div[contains(@role,'slider')])[2]");
    public static final String textKalkisTarih =("[class='flight-departure-time']");
    public static final String textFiyat =("[class='money-int']");
    public static final String buttonSec = ("//span[contains(text(),'Seç')]");
    public static final By buttonSecVeIlerle = By.xpath("//span[contains(text(),'Seç ve İlerle')]");
    public static final By buttonSecDonus = By.xpath("//div[@id='flight-0']//span[contains(text(),'Seç')]");
    public static final By buttonSuperEco = By.cssSelector("[data-testid='returnProviderPackageItemSüper Eko']");
    public static final By havayolları = By.xpath("//div[@class='ctx-filter-airline card-header']//span[@class='card-title']");
    public static final String thyAirlines = ("//span[contains(text(),'Türk Hava Yolları')]");

}
