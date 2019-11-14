package pages;

import constants.Brands;
import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddToCartPage extends BasePage{

    @FindBy(css = ".btn__text")
    private WebElement mamatica;

    @FindBy(css = ".blattgold--form-road.honest-geo")
    private WebElement address;

    @FindBy(css = ".btn--honest.blattgold--form-banner-submit")
    private WebElement zumMenu;

    @FindBy(css = ".product--info")
    private WebElement product;

    @FindBy(id = "topup-modal--close")
    private WebElement addToCart;

    @FindBy(css = ".cart--item")
    private WebElement itemInCart;

    @FindBy(css = ".logo--shop.block")
    private WebElement logo;


    public AddToCartPage(){
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void verifyLogoIsDisplaying(){
        Assert.assertTrue(logo.isDisplayed(), "logo is not displaying");
    }

    public void verifyMamaCitaBrandIsAvailable(){
        Assert.assertTrue(mamatica.isDisplayed(), "mamatica brand is not available");
    }

    public void clickOnMamaCita(){
        mamatica.click();
    }

    public void addAddress(){
        address.sendKeys("Semperstraße 44, 1180 Wien, Austria");
        zumMenu.click();
    }

    public void clickOnProductAndAddToCart() throws InterruptedException {
        wait(5000);
        product.click();
        addToCart.click();
    }

    public void verifyItemIsAddedToCart(){
        Assert.assertTrue(itemInCart.isDisplayed(), "item is not added to cart");
    }

    public void verifyUserNavigateToMamaCitaBrandPage(){
        String currentUrl = getCurrentUrl();
        Assert.assertTrue(currentUrl.toLowerCase().contains(Brands.BRANDS.toLowerCase()), "user is not navigate to desired brand");
    }
}
