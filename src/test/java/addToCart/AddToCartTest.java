package addToCart;

import org.testng.annotations.Test;
import testBase.BaseTest;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyMamaCita() throws InterruptedException {
        navigateToUrl();
        addToCartPage.clickOnMamaCita();
        addToCartPage.addAddress();
        addToCartPage.clickOnProductAndAddToCart();
    }
}
