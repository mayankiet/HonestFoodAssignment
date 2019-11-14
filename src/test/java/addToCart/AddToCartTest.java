package addToCart;

import org.testng.annotations.Test;
import testBase.BaseTest;
import annotations.Author;
import annotations.Tester;
import annotations.TestCaseNotes;
import utils.Categories;

public class AddToCartTest extends BaseTest {

    @Author(name = Tester.MAYANK)
    @TestCaseNotes(steps = "Navigate to url || Select Mamacita brand || Put address || Select dish || Add dish to cart", expectedResult = "item should be added to the cart")
    @Test(groups = {Categories.SMOKE})
    public void verifyUserShouldBeAbleToAddItemToCart() throws InterruptedException {
        navigateToUrl();
        addToCartPage.verifyLogoIsDisplaying();
        addToCartPage.verifyMamaCitaBrandIsAvailable();
        addToCartPage.clickOnMamaCita();
        addToCartPage.addAddress();
        addToCartPage.verifyUserNavigateToMamaCitaBrandPage();
        addToCartPage.clickOnProductAndAddToCart();
        addToCartPage.verifyItemIsAddedToCart();
    }
}
