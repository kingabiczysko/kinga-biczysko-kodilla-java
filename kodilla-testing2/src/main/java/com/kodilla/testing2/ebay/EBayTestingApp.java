package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHEBAY = "gh-ac";

    public static void main(String[] args){

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://www.ebay.com");

        WebElement serchEBay = driver.findElement(By.id(SEARCHEBAY));
        serchEBay.sendKeys("laptop");
        serchEBay.submit();

    }
}
