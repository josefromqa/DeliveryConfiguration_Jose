package deliveryConfiguration_Jose.step_def;

import deliveryConfiguration_Jose.pages.MyReports;
import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MyReports_StepDef {

    static final Logger log = LogManager.getLogger(MyReports_StepDef.class);

    MyReports myReports = new MyReports();

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {

        String expectedTitle="Client Center";
        String actualTitle = DriverFactory.getDriver().getTitle();
        BrowserUtils.wait(7);
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("I am on the web Main Page");

    }


    @When("I click File Center module")
    public void i_click_File_Center_module() throws InterruptedException {
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(10);
        myReports.FileCenter.click();

    }

    @Then("I make sure there is no {string} module")
    public void iMakeSureThereIsNoModule(String arg0) throws InterruptedException {
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        DriverFactory.getDriver().navigate().refresh();

        List<WebElement> myReportsModule=DriverFactory.getDriver().findElements(By.xpath("//span[text()='My Reports']"));
        if (myReportsModule.size()==0){
            System.out.println("There is no My Reports Module..Passed!!!");
        }else{
            System.out.println("My Reports Module shows up before impersonating...Failed!!!");
        }

        log.info("There is no My Reports module");


    }

    @Then("I click on the user icon")
    public void i_click_on_the_user_icon() throws InterruptedException {
        BrowserUtils.wait(7);
        myReports.icon.click();
        System.out.println("J icon");
        log.info("Click the J icon");

    }


    @And("I click the {string} link")
    public void iclicktheStartImpersonatinglink(String startImp) throws InterruptedException {
        BrowserUtils.wait(7);
        Thread.sleep(5000);
        myReports.startImp.click();
        log.info("I click to start impersonation");

    }

    @Then("I add {string} as the username")
    public void i_add_Bob_Backline_as_the_username(String bob) throws InterruptedException {
        BrowserUtils.wait(7);
        Thread.sleep(5000);
        myReports.box.sendKeys("Bob Backline");
        log.info("User Name: Bob Backline");


    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) throws InterruptedException {
        Thread.sleep(5000);
        BrowserUtils.wait(7);
        myReports.startImp2.click();
        log.info("Click the button");
    }

    @Then("I click on the My Reports button")
    public void iClickOnTheMyReportsButton() throws InterruptedException{
        Thread.sleep(5000);
        BrowserUtils.wait(7);
        myReports.MyReports.click();
        log.info("Click the My Reports button");
    }

    @And("I am in the My Reports module")
    public void iAmInTheMyReportsModule() {
        BrowserUtils.wait(10);
        if (myReports.MyReports.isDisplayed()) {
            System.out.println("PASSED!!My Reports Module is here");
        } else {
            System.out.println("FAILED");
        }
        log.info("I am in the My Reports module");

    }



  

  /*  @Then("I should be able to see the Batch Status column")
    public void iShouldBeAbleToSeeTheBatchStatusColumn() {

        System.out.println("I see the Batch Status column");

    } */


}