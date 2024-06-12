package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsMenPage extends Utility {
    By mouseHoverYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickSize32 = By.xpath("(//div[@id='option-label-size-143-item-175'])[1]");
    By colourBlack = By.xpath("(//div[@id='option-label-color-93-item-49'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By verifyText = By.xpath("(//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)'])[1]");
    By clickShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverToYogaPant(){
        mouseHoverToElement(mouseHoverYogaPant);
    }
    public void clickOnSize(){
        clickOnElement(clickSize32);
    }
    public void clickOnBlackColour(){
        clickOnElement(colourBlack);
    }
    public void clickAddToCart(){
        clickOnElement(addToCart);
    }
    public String setVerifyText(){
        return getTextFromElement(verifyText);
    }
    public void clickOnShoppingCart(){
        clickOnElement(clickShoppingCart);
    }


}
