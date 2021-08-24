package deliveryConfiguration_Jose.pages;

import deliveryConfiguration_Jose.utilities.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(DriverFactory.getDriver(), this);
    }


}
