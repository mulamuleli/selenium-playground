package demoblaze_controllers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoblazeControls extends BaseTest
{
    public static boolean clickOnElement(By object, String elementName)
    {
        boolean bFlag=false;
        try {
            if(driver.findElement(object).isDisplayed())
            {
                driver.findElement(object).click();
                Thread.sleep(1000);
//                InsTLog.info("Successfully clicked on "+elementName);
                bFlag= true;
            }
            else
            {
//                InsTExceptionHandle.HandleAssertion("Failed to click on " + elementName);
            }
        }
        catch (Exception e)
        {   System.out.println(e.getMessage());
//            InsTExceptionHandle.HandleException(e, "Failed to click on " + elementName);

        }
        return bFlag;
    }
    public static boolean waitForElement(By Locator, long lTime)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, lTime);
            wait.until(ExpectedConditions.elementToBeClickable (Locator));
            //Thread.sleep(2000); implicit  or explicit wait
            return true;
        }
        catch(Exception e)
        {
//            InsTExceptionHandle.HandleException(e, "Failed to wait for element to be visible");
            return false;
        }
    }
    public static void typeInTextBox(By object,String data,String elementName)
    {
        try
        {
            if(driver.findElement(object).isDisplayed())
            {
                driver.findElement(object).clear();
                driver.findElement(object).click();
                driver.findElement(object).sendKeys(data);
//                MIQLog.info("Entered data in "+elementName+" textbox");
            }
            else
            {
//                MIQExceptionHandle.HandleAssertion("Failed to confirm if " + elementName + "is Displayed");
            }
        }
        catch (Exception e)
        {
//            MIQExceptionHandle.HandleException(e, "Failed to enter data in " + elementName + " textbox");
        }
    }
    public static void acceptAlert() throws Exception
    {
        String textOnAlert = null;
        Alert alert = null;
        try
        {
            alert = driver.switchTo().alert();
            textOnAlert=alert.getText();
            alert.accept();
            System.out.println(textOnAlert);
        }
        catch (NoAlertPresentException ex)
        {
//            HandleException(ex,"There is no alert found")
        }

    }
}
