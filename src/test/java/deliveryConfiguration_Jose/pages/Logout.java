package deliveryConfiguration_Jose.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {

    @FindBy(xpath = "//span[@class='MuiBadge-root']")
    public WebElement Bbutton;

    @FindBy(xpath = "//a[.='Sign out']")
    public WebElement Signout;



}
