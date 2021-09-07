package deliveryConfiguration_Jose.pages;

import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.ConfigurationReader;
import deliveryConfiguration_Jose.utilities.EmailUtils;
import org.joda.time.LocalDateTime;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectDownload extends BasePage{

    @FindBy(xpath = "//input[@id='rawUserInput']")
    private WebElement userName;

    @FindBy(xpath = "//button[@id='continue']")
    private WebElement NextBtn;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement BobPassword;

    //b2c username page
    @FindBy(id = "rawUserInput")
    private WebElement b2c_userName;

    @FindBy(id = "continue")
    private WebElement b2c_NextButton;
    @FindBy(className = "confirmlogin-card")
    private WebElement unrecognized_ip_window;
    @FindBy(className = "card-message")
    private WebElement unrecognized_ip_message;
    @FindBy(id = "VerificationCode")
    private WebElement key_input_field;
    @FindBy(className = "verifyCode")
    private WebElement verify_code_btn;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement sign;

    @FindBy(id = "idSIButton9")
    private WebElement StaySignedIn;



    /*public void setLogin() {
        //String passwordValue= ConfigurationReader.getProperty("BobPassword");
        BobPassword.sendKeys("BobPassword");
        yesButton.click();
        BrowserUtils.wait(7);
        sign.click();
    } */

    public void SetLogin()throws Exception{
        EmailUtils emailUtils = new EmailUtils();
        String userNameValue1 = ConfigurationReader.getProperty("userNameValue1");
        String passwordValue1 = ConfigurationReader.getProperty("passwordValue1");
        try {
            userName.sendKeys(userNameValue1);
            BrowserUtils.wait(10);
            Thread.sleep(5000);
            NextBtn.click();
            BrowserUtils.wait(10);
            Thread.sleep(5000);
        } catch (Exception e) {
            b2c_userName.sendKeys(userNameValue1);
            BrowserUtils.wait(10);
            Thread.sleep(5000);
            b2c_NextButton.click();
            BrowserUtils.wait(10);
            Thread.sleep(5000);
        }
        password.sendKeys(passwordValue1);
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        sign.click();
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        StaySignedIn.click();

        LocalDateTime timeNow = LocalDateTime.now();

        System.out.println("Time Now: "+timeNow);
        BrowserUtils.wait(10);

        boolean needVerification = emailUtils.needToBeVerified();

        if (needVerification){
            BrowserUtils.waitVisibilityOf(unrecognized_ip_window);
            BrowserUtils.wait(10);
            Thread.sleep(5000);
            String Code_verification_window_message = unrecognized_ip_message.getText();
            System.out.println("Code Verification Window Message: "+Code_verification_window_message);
            String securityKey = emailUtils.getSecurityKey(timeNow, "Bob.Backline@npd.com", "Baseball1", "Bob");
            BrowserUtils.wait(10);
            Thread.sleep(5000);
            key_input_field.sendKeys(securityKey);
            BrowserUtils.wait(10);
            Thread.sleep(5000);
            verify_code_btn.click();
            BrowserUtils.wait(10);
            Thread.sleep(5000);
        }


    }
}
