package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.By;

public class BasePage {
    public void navigateTo(String module) {
        String xpath = "//span[contains(text(),'"+module+"')]";
        Driver.getDriver().findElement(By.xpath(xpath));
    }
}
