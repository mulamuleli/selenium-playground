package demoblaze_stepDefinitions;
import demoblaze_controllers.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoblazeSignUp extends  BaseTest
{
    @Test
    public void SignUp()
    {
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
    }
}
