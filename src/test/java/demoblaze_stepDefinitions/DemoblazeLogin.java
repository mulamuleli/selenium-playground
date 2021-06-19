package demoblaze_stepDefinitions;

import demoblaze_controllers.BaseTest;
import demoblaze_controllers.DemoblazeControls;
import demoblaze_pageObjects.DemoBlazeSignUPObjects;
import demoblaze_pageObjects.DemoblazeLoginObjects;
import org.jsoup.Connection;
import org.testng.annotations.Test;

public class DemoblazeLogin extends BaseTest
{
    @Test
    public void Login()
    {
        DemoblazeControls.waitForElement(DemoblazeLoginObjects.Login_linkButton, 10);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_linkButton, "Login Link");

        DemoblazeControls.waitForElement(DemoblazeLoginObjects.LoginUsername_textField,10);
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginUsername_textField,"rabs", " Login Username Text Field");
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginPassword_passwordField,"123456789","Login Password Field");
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_button,"Login up Button");


    }
}
