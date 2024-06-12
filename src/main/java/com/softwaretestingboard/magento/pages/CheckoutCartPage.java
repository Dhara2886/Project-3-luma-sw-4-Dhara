package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutCartPage extends Utility {
    By shoppingCartText = By.xpath("//span[@class='base']");
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By colour = By.xpath("//dd[contains(text(),'Black')]");


    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String verifyCronusYogaPant(){
        return getTextFromElement(cronusYogaPant);
    }
    public String verifySize(){
        return getTextFromElement(size);
    }
    public String verifyColour(){
        return getTextFromElement(colour);
    }
}
