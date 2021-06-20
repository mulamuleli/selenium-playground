package demoblaze_pageObjects;

import org.openqa.selenium.By;

public class DemoBlazePlaceOrderObject
{
    public static final By PlaceOder_button = By.xpath("//button[contains(text(),'Place Order')]");
    public static final By PlaceOrderName_textField= By.xpath("//input[@id='name']");
    public static final By PlaceOrderCountry_textField= By.xpath("//input[@id='country']");
    public static final By PlaceOrderCity_textField= By.xpath("//input[@id='city']");
    public static final By PlaceOrderCreditCard_textField= By.xpath("//input[@id='card']");
    public static final By PlaceOrderMonth_textField= By.xpath("//input[@id='month']");
    public static final By PlaceOrderYear_textField= By.xpath("//input[@id='year']");
    public static final By PlaceOrderPurchaseOrder_button= By.xpath("//button[@onclick='purchaseOrder()' and contains(text(),'Purchase')]");
    public static final By PlaceOrderSuccessMessage_text=  By.xpath("//h2[contains(text(),'Thank you for your purchasea!')]");
    public static final By PlaceOrderSuccessOk_button =  By.xpath("//button[contains(text(), 'OK')]");



}
