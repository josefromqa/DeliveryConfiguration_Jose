package deliveryConfiguration_Jose.pages;

import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.ConfigurationReader;
import deliveryConfiguration_Jose.utilities.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

    private static final Logger logger = Logger.getLogger(Login.class);

    //protected WebDriver driver= DriverFactory.getDriver();


    @FindBy(id = "Username")
    private WebElement userName;

    @FindBy(id = "nextBtn")
    private WebElement NextButton;


    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement password;


    @FindBy(xpath = "//input[@type='submit']")
    private WebElement sign;

    @FindBy(id = "idSIButton9")
    private WebElement Yesbtn;





 /*   @FindBy(xpath = "//span[@class='MuiButtonBase-root MuiTableSortLabel-root jss107']")
//xpath syntax= "//div[@class='paste locator here']"
    private WebElement sorting;


    @FindBy(xpath = "//input[@id='basicSearch-Search']")
    public WebElement searchBox;


    @FindBy(xpath = "//td[.='Canada Beauty POS Monthly - FF Profile']")
//xpath="//div[.='yourtext']"
    public WebElement canada;

    @FindBy(xpath="//table[@aria-labelledby='tableTitle']/tbody/tr[1]/td[5]/span/span/input")
    public WebElement firstRD;


    @FindBy(xpath="//table[@aria-labelledby='tableTitle']/tbody/tr[2]/td[5]/span/span/input")
    public WebElement secondRD;


    //@FindBy(xpath="//table[@aria-labelledby='tableTitle']/tbody/tr[3]/td[5]/span/span/input")
    //public WebElement secondRD;

*/


    public void setLogin() {

        String userNameValue = ConfigurationReader.getProperty("userNameValue");
        String passwordValue = ConfigurationReader.getProperty("passwordValue");

        userName.sendKeys(userNameValue);
        NextButton.click();
        BrowserUtils.wait(7);

        password.sendKeys(passwordValue);
        BrowserUtils.wait(7);


        Yesbtn.click();
        BrowserUtils.wait(7);
        sign.click();

    }



    }
