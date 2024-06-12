package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {
    By verifyText = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By clickTrolley = By.xpath("//span[@class='counter-number']");
    By verify$135 = By.xpath("//span[contains(text(),'$135.00')]");
    By changeQty1 = By.id("cart-item-133823-qty");
    By clickUpdate = By.xpath("//span[normalize-space()='Update']");
    By verify$225 = By.xpath("//span[contains(text(),'$225.00')]");

    public String verifyOvernightDuffleText(){
        return getTextFromElement(verifyText);
    }
    public void changeQtyTo3(String quantity){
        sendTextToElement(changeQty, quantity);
    }
    public void clickOnTrolley(){
        clickOnElement(clickTrolley);
    }
    public String verifyPrice135(){
        return getTextFromElement(verify$135);
    }
    public void changeQtyTo5(String quantity1){
        sendTextToElement(changeQty1,quantity1);
    }
    public void clickOnUpdate(){
        clickOnElement(clickUpdate);
    }
    public String verifyPrice225(){
        return getTextFromElement(verify$225);
    }
}
