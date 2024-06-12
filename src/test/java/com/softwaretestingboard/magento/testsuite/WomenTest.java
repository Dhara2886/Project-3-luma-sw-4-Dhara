package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsWomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WomenTest extends BaseTest {
HomePage homePage = new HomePage();
JacketsWomenPage jacketsWomenPage = new JacketsWomenPage();

/*
 1. verifyTheSortByProductNameFilter
 * Mouse Hover on Women Menu
 * Mouse Hover on Tops
 * Click on Jackets
 * Select Sort By filter “Product Name”
 * Verify the products name display in
 alphabetical order
 */
    @Test
    public void verifyTheSortByProductNameFilter(){
        homePage.mouseHoverToWomenTab();
        homePage.mouseHoverToTops();
        homePage.clickOnJackets();
        WebElement dropDown = driver.findElement(By.id("sorter"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Product Name");
        List<String> actualList = jacketsWomenPage.listProductList();
        System.out.println(actualList);
        List<String> sortedProductNames = new ArrayList<>(actualList);
        sortedProductNames.sort(Comparator.naturalOrder());
        System.out.println(sortedProductNames);
        boolean Sorted = actualList.equals(sortedProductNames);
        Assert.assertFalse(Sorted);

    }
    /*
     2. verifyTheSortByPriceFilter
 * Mouse Hover on Women Menu
 * Mouse Hover on Tops
 * Click on Jackets
 * Select Sort By filter “Price”
 * Verify the products price display in Low to High
     */
    @Test
    public void verifyTheSortByPriceFilter(){
        homePage.mouseHoverToWomenTab();
        homePage.mouseHoverToTops();
        homePage.clickOnJackets();
        WebElement dropDown1 = driver.findElement(By.id("sorter"));
        Select select1 = new Select(dropDown1);
        select1.selectByVisibleText("Price");
        List<String> actualList1 = jacketsWomenPage.listProductPriceList();
        System.out.println(actualList1);
        List<String> sortedProductPriceNames = new ArrayList<>(actualList1);
        sortedProductPriceNames.sort(Comparator.naturalOrder());
        System.out.println(sortedProductPriceNames);
        boolean Sorted = actualList1.equals(sortedProductPriceNames);
        Assert.assertFalse(Sorted);


    }


}
