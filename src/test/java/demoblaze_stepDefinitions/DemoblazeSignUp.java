package demoblaze_stepDefinitions;
import demoblaze_controllers.BaseTest;
import demoblaze_controllers.DemoblazeControls;
import demoblaze_pageObjects.DemoBlazeSignUPObjects;
import org.testng.annotations.Test;

public class DemoblazeSignUp extends  BaseTest
{
    @Test
    public void SignUp()
    {
            DemoblazeControls.waitForElement(DemoBlazeSignUPObjects.signUp_linkButton,12);
            DemoblazeControls.clickOnElement(DemoBlazeSignUPObjects.signUp_linkButton,"Sign Up Link Button");

            DemoblazeControls.waitForElement(DemoBlazeSignUPObjects.SignUpUsername_textField,5);
            DemoblazeControls.typeInTextBox(DemoBlazeSignUPObjects.SignUpUsername_textField,"Rabs", "Username Text Field");
            DemoblazeControls.typeInTextBox(DemoBlazeSignUPObjects.SignUPPassword_passswordField,"123456789","Sign up Password Field");
            DemoblazeControls.clickOnElement(DemoBlazeSignUPObjects.SignUP_button,"Sign up Button");

            // click on login Button using Sikuli


    }
}
