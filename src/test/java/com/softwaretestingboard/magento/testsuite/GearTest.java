package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();

    /*
    1. userShouldAddProductSuccessFullyToShoppinCart()
 * Mouse Hover on Gear Menu
 * Click on Bags
 * Click on Product Name ‘Overnight Duffle’
 * Verify the text ‘Overnight Duffle’
 * Change Qty 3
 * Click on ‘Add to Cart’ Button.
 * Verify the text ‘You added Overnight Duffle to your shopping cart.’
 * Click on ‘shopping cart’ Link into message
 * Verify the product name ‘CronusYogaPant’
 * Verify the Qty is ‘3’
 * Verify the product price ‘$135.00’
 * Change Qty to ‘5’
 * Click on ‘Update Shopping Cart’ button
 * Verify the product price ‘$225.00
     */

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){
        homePage.mouseHoverToGear();
        homePage.clickOnBags();
        bagsPage.clickOnOvernightDuffle();
        String expectedText = "Overnight Duffle";
        String actualText = overnightDufflePage.verifyOvernightDuffleText();
        Assert.assertEquals(actualText,expectedText,"Overnight Duffle");
        overnightDufflePage.changeQtyTo3("3");
        String expectedPrice = "$135.00";
        String actualPrice = overnightDufflePage.verifyOvernightDuffleText();
        Assert.assertEquals(actualPrice, expectedPrice,"$135.00");
        overnightDufflePage.changeQtyTo5("5");
        overnightDufflePage.clickOnUpdate();
        String expectedPrice1 = "$225.00";
        String actualTextPrice2 = overnightDufflePage.verifyOvernightDuffleText();
        Assert.assertEquals(actualTextPrice2, expectedPrice1,"$225.00");



    }
}
