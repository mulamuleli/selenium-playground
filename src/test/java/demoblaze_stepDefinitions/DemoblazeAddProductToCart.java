package demoblaze_stepDefinitions;

import demoblaze_controllers.BaseTest;
import demoblaze_controllers.DemoblazeControls;
import demoblaze_pageObjects.DemoblazeLoginObjects;
import demoblaze_pageObjects.DemoblazeAddProductToCartObjects;


import org.openqa.selenium.Alert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DemoblazeAddProductToCart extends BaseTest
{
    @Test
    public void AddProductToCart() throws Exception {
        //login to profile first
        DemoblazeControls.waitForElement(DemoblazeLoginObjects.Login_linkButton, 10);
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_linkButton, "Login Link");

        DemoblazeControls.waitForElement(DemoblazeLoginObjects.LoginUsername_textField,10);
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginUsername_textField,"rabs", " Login Username Text Field");
        DemoblazeControls.typeInTextBox(DemoblazeLoginObjects.LoginPassword_passwordField,"123456789","Login Password Field");
        DemoblazeControls.clickOnElement(DemoblazeLoginObjects.Login_button,"Login up Button");


        // Adding products to cart
//        String FilePath= "C://Users//27813//IdeaProjects//selenium-playground-forked//src//test//resources//demoblazeData//Images//";
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

    }
}
