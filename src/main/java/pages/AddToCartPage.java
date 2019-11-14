package pages;

import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public AddToCartPage(){
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
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
}
