package demoblaze_pageObjects;

import org.openqa.selenium.By;

public class DemoblazeLoginObjects
{
    public static final By Login_linkButton = By.xpath("//a[@id='login2']");
    public static final By LoginUsername_textField=  By.xpath("//input[@id='loginusername']");
    public static final By LoginPassword_passwordField = By.xpath("//input[@id='loginpassword']");
    public static final By Login_button=  By.xpath("//button[@onclick='logIn()']");
}
