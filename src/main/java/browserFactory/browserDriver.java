package browserFactory;

import org.openqa.selenium.WebDriver;

public interface browserDriver {

    WebDriver getDriver();
    void setBinaryPath();

}
