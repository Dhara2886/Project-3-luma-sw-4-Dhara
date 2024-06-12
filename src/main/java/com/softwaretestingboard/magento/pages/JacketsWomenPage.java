package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JacketsWomenPage extends Utility {
    By productNames = By.xpath("(//strong[@class='product name product-item-name'])[1]");
    By productPriceNames = By.xpath("//span[contains(text(),'$32.00')]");
    public List<String> listProductList(){
        List<String> listOfProducts = new ArrayList<>();

        for (WebElement ele : findMultipleElements(productNames) ) {
            listOfProducts.add(ele.getText().trim());
        }
        return listOfProducts;
    }
    public List<String> listProductPriceList() {
        List<String> listOfProductsPrice = new ArrayList<>();

        for (WebElement ele : findMultipleElements(productNames) ) {
            listOfProductsPrice.add(ele.getText().trim());
        }
        return listOfProductsPrice;
    }
    }


