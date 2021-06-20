package demoblaze_stepDefinitions;

import demoblaze_controllers.BaseTest;
import demoblaze_controllers.DemoblazeControls;
import demoblaze_pageObjects.DemoblazeAddProductToCartObjects;
import demoblaze_pageObjects.DemoblazeCartObjects;
import demoblaze_pageObjects.DemoblazeLoginObjects;
import org.testng.annotations.Test;

public class DemoblazeNavigateToCart extends BaseTest
{
    @Test
    public void viewCart() throws Exception {
        //login to profile first
        DemoblazeControls.waitForElement(DemoblazeLoginObjects.Login_linkButton, 10);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_linkButton, "Login Link");
        DemoblazeControls.waitForElement(DemoblazeLoginObjects.LoginUsername_textField,10);
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginUsername_textField,"rabs", " Login Username Text Field");
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginPassword_passwordField,"123456789","Login Password Field");
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_button,"Login up Button");



//        Add the product to the cart
//        DemoblazeAddProductToCart.AddProductToCart();

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddFirstProduct,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddFirstProduct,"Samsung Galaxy s6 Link");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddFirstProductToCart_button,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddFirstProductToCart_button, " Samsung Galaxy s6 Add To Cart Button");
//
        Thread.sleep(800);
        DemoblazeControls.acceptAlert();

        DemoblazeControls.waitForElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink,5);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink, "Demoblaze Home Page Link");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddSecondProduct,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddSecondProduct,"Samsung Galaxy s6 Link");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddSecondProductToCart_button,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddSecondProductToCart_button, " Samsung Galaxy s6 Add To Cart Button");

        Thread.sleep(800);
        DemoblazeControls.acceptAlert();

        DemoblazeControls.waitForElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink,5);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink, "Demoblaze Home Page Link");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddProductsNext_button,5);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddProductsNext_button, "Next Button");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddThirdProduct,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddThirdProduct,"Samsung Galaxy s6 Link");

        DemoblazeControls.waitForElement(DemoblazeAddProductToCartObjects.AddThirdProductToCart_button,10);
        DemoblazeControls.clickOnElement(DemoblazeAddProductToCartObjects.AddThirdProductToCart_button, " Samsung Galaxy s6 Add To Cart Button");

        Thread.sleep(800);
        DemoblazeControls.acceptAlert();

        DemoblazeControls.waitForElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink,5);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.DemoblazeBrand_homePageLink, "Demoblaze Home Page Link");


        //Navigate to Cart
        DemoblazeControls.waitForElement(DemoblazeCartObjects.Cart_link,3);
        DemoblazeControls.clickOnElement(DemoblazeCartObjects.Cart_link, "Cart Link");
        String sPageTitle="Products";
        String sCartProduct="MacBook air";
        DemoblazeControls.waitForElement(DemoblazeCartObjects.CartPageHeading_text, 5);
        String CartProduct= DemoblazeControls.getElementText(DemoblazeCartObjects.CartProduct_text, "MacBook air");
        String PageTitle=DemoblazeControls.getElementText(DemoblazeCartObjects.CartPageHeading_text, " Report Title");
        if(PageTitle.equalsIgnoreCase(sPageTitle) && CartProduct.equalsIgnoreCase(sCartProduct))
        {
            System.out.println("Successfully verified the Carts page and cart product");
//            MIQLog.info( sReportDesc +" have been  successfully Verified");
        }
        else
        {
            System.out.println("failed to verify the Carts page and added products");
//          MIQExceptionHandle.HandleAssertion("Failed to Failed :" + sReportDesc + "report lists page title");
        }




    }

}
