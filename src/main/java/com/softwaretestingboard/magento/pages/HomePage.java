package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By mouseHoverWomen = By.xpath("//a[@id='ui-id-4']");
    By mouseHoverTops = By.xpath("(//a[@id='ui-id-9'])[1]");
    By jackets = By.xpath("(//span[contains(text(),'Jackets')])[1]");
    By mouseHoverMen = By.xpath("//span[normalize-space()='Men']");
    By mouseHoverBottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantsClick = By.xpath("(//span[contains(text(),'Pants')])[2]");
    By mouseHoverGear = By.xpath("//span[normalize-space()='Gear']");
    By clickBags = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverToWomenTab(){
        mouseHoverToElement(mouseHoverWomen);
    }
    public void mouseHoverToTops(){
        mouseHoverToElement(mouseHoverTops);
    }
    public void clickOnJackets(){
        clickOnElement(jackets);
    }
    public void mouseHoverToMen(){
        mouseHoverToElement(mouseHoverMen);
    }
    public void mouseHoverToBottoms(){
        mouseHoverToElement(mouseHoverBottoms);
    }
    public void clickOnPants(){
        clickOnElement(pantsClick);
    }
    public void mouseHoverToGear(){
        mouseHoverToElement(mouseHoverGear);
    }
    public void clickOnBags(){
        clickOnElement(clickBags);
    }

}
