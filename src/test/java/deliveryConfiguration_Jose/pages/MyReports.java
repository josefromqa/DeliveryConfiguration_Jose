package deliveryConfiguration_Jose.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyReports extends BasePage {

    @FindBy(xpath = "//a[@title='File Center']")
    public WebElement FileCenter;

    @FindBy(xpath = "//span[@class='MuiBadge-root']")
    public WebElement icon;

    @FindBy(xpath = "//div[text() ='Start impersonating']")
    public WebElement startImp;

    @FindBy(xpath = "//input[@placeholder='add username']")
    public WebElement box;

    @FindBy(xpath = "//span[text() ='Start Impersonating']")
    public WebElement startImp2;

    @FindBy(xpath = "//button[@value='reports']")
    public WebElement MyReports;


/*
    public void setClientCenter() {
        BrowserUtils.wait(10);
        FileCenter.click();

    }

    public void setMyReports() {
        BrowserUtils.wait(10);
        icon.click();
        BrowserUtils.wait(10);
        startImp.click();
        BrowserUtils.wait(10);
        box.sendKeys("Bob Backline");
        BrowserUtils.wait(10);
        startImp2.click();
        BrowserUtils.wait(10);
        MyReports.click();
    } */
}
/*
    public void setCreatedBy(){

        for (int i = 0; i < ; i++) {
            
        }
    }


}
*/