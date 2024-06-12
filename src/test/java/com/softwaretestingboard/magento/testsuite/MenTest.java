package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.CheckoutCartPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsMenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    PantsMenPage pantsMenPage = new PantsMenPage();
    CheckoutCartPage checkoutCartPage = new CheckoutCartPage();
    /*
     1. userShouldAddProductSuccessFullyToShoppingCart()
 * Mouse Hover on Men Menu
 * Mouse Hover on Bottoms
 * Click on Pants
 * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
 * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
 * Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
 * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
 * Click on ‘shopping cart’ Link into message
 * Verify the text ‘ShoppingCart.’
 * Verify the product name ‘CronusYogaPant’
 * Verify the product size ‘32’
 * Verify the product colour ‘Black’
     */
    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){
        homePage.mouseHoverToMen();
        homePage.mouseHoverToBottoms();
        homePage.clickOnPants();
        pantsMenPage.mouseHoverToYogaPant();
        pantsMenPage.clickOnSize();
        pantsMenPage.mouseHoverToYogaPant();
        pantsMenPage.clickOnBlackColour();
        pantsMenPage.mouseHoverToYogaPant();
        pantsMenPage.clickAddToCart();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantsMenPage.setVerifyText();
        Assert.assertEquals(actualText,expectedText,"You added Cronus Yoga Pant to your shopping cart.");
        pantsMenPage.clickOnShoppingCart();
        String expectedCartText = "Shopping Cart";
        String actualCartText = checkoutCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualCartText,expectedCartText, "Shopping Cart");
        String expectedCartText1 = "Cronus Yoga Pant";
        String actualCartText1 = checkoutCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualCartText1,expectedCartText1, "Cronus Yoga Pant");
        String expectedCartText2 = "32";
        String actualCartText2 = checkoutCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualCartText2, expectedCartText2, "32");
        String expectedCartText3 = "Black";
        String actualCartText3 = checkoutCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualCartText3, expectedCartText3, "Black");

    }

}
