package core_class;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public abstract class ControlBase {
    public WebElement webElement;

    public ControlBase(WebElement webElement) {
        this.webElement = webElement ;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }


}

