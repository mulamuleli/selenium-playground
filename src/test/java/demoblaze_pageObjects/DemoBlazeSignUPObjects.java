package demoblaze_pageObjects;

import org.openqa.selenium.By;

public class DemoBlazeSignUPObjects
{
    public static final By signUp_linkButton = By.xpath("//a[@id='signin2']");
    public static final By SignUpUsername_textField= By.xpath("//input[@id='sign-username']");
    public static final By SignUPPassword_passswordField= By.xpath("//input[@id='csign-password']");
    public static final By SignUP_button= By.xpath("//button[contains(text(), 'Sign up') and @onclick='register()']");
    public static final By SignUPCancel_button= By.xpath("//button[contains(text(), 'Close')]");

}
