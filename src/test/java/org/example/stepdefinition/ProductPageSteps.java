package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.LoginPage;
import org.example.pageobject.pages.ProductPage;
import org.testng.Assert;

import static org.example.stepdefinition.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinition.BaseSteps.webDriver;

public class ProductPageSteps {
    @Given("User is on {string}")
    public void userIsOnPage(String pageName) {
        ProductPage productPage = new ProductPage(webDriver);
        PAGES_STORAGE.put(pageName, productPage);
        productPage.open();
    }

    @When("User add product to cart")
    public void userAddProductToCart() {

        ProductPage productPage = (ProductPage) PAGES_STORAGE.get(pageName);
        productPage.addToCart()

        PAGES_STORAGE.put("ProductPage", productPage);
    }

    @Then("User close slidesheet")
    public void userCloseSlidesheet () {
        ProductPage productPage = (ProductPage) PAGES_STORAGE.get(pageName);
        productPage.closeSlideSheet()
    }

    @And("Cart info is equal {string}")
    public void cartInfoIsEqual(String expectedAmount) {
        ProductPage productPage = (ProductPage) PAGES_STORAGE.get(pageName);

        Assert.assertEquals(productPage.takeCartAmount(), expectedAmount, "Cart amount is wrong");
    }

//    @Then("User gets error message {string} on {string}")
//    public void userGetsErrorMessage(String errorMessage, String pageName) {
//        Assert.assertEquals(((LoginPage) PAGES_STORAGE.get(pageName)).clickSighInButtonAndReceiveErrorMessage(), errorMessage,
//                "");
//    }


}
