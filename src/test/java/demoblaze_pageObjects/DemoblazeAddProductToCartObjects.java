package demoblaze_pageObjects;

import org.openqa.selenium.By;

public class DemoblazeAddProductToCartObjects
{
    public static final By AddFirstProduct = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    public static final By AddFirstProductToCart_button =  By.xpath("//a[contains(text(),'Add to cart') and @onclick='addToCart(1)']");

    public static final By AddSecondProduct = By.xpath("//a[contains(text(),'Sony vaio i7')]");
    public static final By AddSecondProductToCart_button= By.xpath("//a[contains(text(),'Add to cart') and @onclick='addToCart(9)']");

    public static final By AddProductsNext_button=  By.xpath("//button[@id='next2' and contains(text(), 'Next')]");

    public static final By AddThirdProduct= By.xpath("//a[contains(text(),'MacBook air')]");
    public static final By AddThirdProductToCart_button= By.xpath("//a[contains(text(),'Add to cart') and @onclick='addToCart(11)']");
}

