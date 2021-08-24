package deliveryConfiguration_Jose.step_def;

import deliveryConfiguration_Jose.pages.Logout;
import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logout_StepDef {

    static final Logger log = LogManager.getLogger(Logout_StepDef.class);

    Logout logout=new Logout();

    @When("I click the Icon on the top right side")
    public void iClickTheIconOnTheTopRightSide() {
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(3);
        logout.Bbutton.click();
        log.info("Click the button");

    }

    @And("I should be able to select {string}")
    public void iShouldBeAbleToSelect(String arg0) {
        BrowserUtils.wait(7);
        logout.Signout.click();
        log.info("Select to sign out");
    }

    @Then("I should be able to logout")
    public void iShouldBeAbleToLogout() {
        BrowserUtils.wait(3);
        String actualT= DriverFactory.getDriver().getTitle();
        String ExpectedT="Sign in";

        Assert.assertEquals(ExpectedT,actualT);
        BrowserUtils.wait(3);
        System.out.println("Actual Title is : " +actualT);
        System.out.println("Expected Title is : " +ExpectedT);

        if(actualT.equals(ExpectedT)){
            System.out.println("I already logged out!!!");
        }else{
            System.out.println("Something is wrong");
        }

        log.info("Verify that you have been logged out");

    }

}
