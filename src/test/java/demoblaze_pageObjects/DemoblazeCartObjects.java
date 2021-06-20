package demoblaze_pageObjects;

import org.openqa.selenium.By;

public class DemoblazeCartObjects
{
    public static final By Cart_link = By.xpath("//a[@id ='cartur' and contains(text(),'Cart')]");
    public static final By CartPageHeading_text= By.xpath("//div//h2[contains(text(),'Products')]");
    public static final By CartProduct_text=  By.xpath("//tbody[@id='tbodyid']//tr[@class='success']//td[contains(text(),'MacBook air')]");

}
