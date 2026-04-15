package edu.pe.cibertec.saucedemo.ui;

public class InventoryPage {

    public static final String PAGE_TITLE = "[data-test='title']";
    public static final String ORDER_PRODUCT_SELECT = "[data-test='product-sort-container']";
    public static final String FIRST_ITEM_PRICE = "[data-test='inventory-item']:first-child [data-test='inventory-item-price']";
    public static final String LAST_ITEM_PRICE = "[data-test='inventory-item']:last-child [data-test='inventory-item-price']";

    public static  String itemNameLink (String productName){
        return  "text=" + productName;
    }

    public static final String CART_LINK = "[data-test='shopping-cart-link']";
    public static final String CART_BADGE = "[data-test='shopping-cart-badge']";

    public static String addToCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "#add-to-cart-" + slug;
    }
    public static String removeFromCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "#remove-" + slug;
    }
}
