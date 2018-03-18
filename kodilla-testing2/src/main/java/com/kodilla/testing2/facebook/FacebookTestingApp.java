package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {


    public static final String XPATH_DAYOFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTHOFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAROFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args){

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://www.facebook.com");

        WebElement dayOfBirth = driver.findElement(By.xpath(XPATH_DAYOFBIRTH));
        Select selectBoardDay = new Select(dayOfBirth);
        selectBoardDay.selectByIndex(9);

        WebElement monthOfBirth = driver.findElement(By.xpath(XPATH_MONTHOFBIRTH));
        Select selectBoardMonth = new Select(monthOfBirth);
        selectBoardMonth.selectByIndex(11);

        WebElement yearOfBirth = driver.findElement(By.xpath(XPATH_YEAROFBIRTH));
        Select selectBoardYear = new Select(yearOfBirth);
        selectBoardYear.selectByIndex(10);


    }
}
