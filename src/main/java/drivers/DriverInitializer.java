package drivers;

import browserFactory.ChromeBrowser;
import browserFactory.FirefoxBrowser;
import org.openqa.selenium.WebDriver;
import constants.Browsers;

public class DriverInitializer {

    private String browser;

    public DriverInitializer(String browser){
        this.browser = browser;
    }

    public WebDriver init(){

         WebDriver webDriver = null;

        switch (browser){
            case Browsers.CHROME:
                webDriver = new ChromeBrowser().getDriver();
                break;

            case Browsers.FIREFOX:
                webDriver = new FirefoxBrowser().getDriver();
                break;
        }
        DriverProvider.setDriver(webDriver);
        return webDriver;
    }
}
