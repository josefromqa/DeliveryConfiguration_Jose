package deliveryConfiguration_Jose.step_def;

import deliveryConfiguration_Jose.pages.Login;
import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.ConfigurationReader;
import deliveryConfiguration_Jose.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Login_Step_Def {

    static final Logger log = LogManager.getLogger(Login_Step_Def.class);

    Login login=new Login();

    @Given("I am on the website")
    public void i_am_on_the_website() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(3);
        log.info("I am on the web page");


    }

    @When("I enter the credentials")
    public void i_enter_the_credentials() {
        BrowserUtils.wait(3);
        login.setLogin();
        log.info("Enter the credentials");

    }

    @Then("I should able to login to main website page")
    public void i_should_able_to_login_to_main_website_page() {

        String expectedTitle="Client Center";
        BrowserUtils.wait(5);
        Assert.assertEquals("Title verification failed", "Client Center",DriverFactory.getDriver().getTitle());
        log.info("Verify that you are in the main title page");

    }




    }


/*
    @Given("I am on the search box")
    public void iAmOnTheSearchBox() {
        System.out.println("I am on the search box");
        BrowserUtils.wait(3);

    }

    @When("I search in {string}")
    public void iSearchInAs(String Canada) {
        BrowserUtils.wait(3);
        login.searchBox.sendKeys("Canada"+ Keys.ENTER);

    }


    @Then("I should verify the results show only Canada")
    public void iShouldVerifyTheResultsShowOnlyCanada() {
        BrowserUtils.wait(3);
        String actual=  login.canada.getText();
        System.out.println(actual);
        BrowserUtils.wait(3);
        String expected="Canada Beauty POS Monthly - FF Profile";
        Assert.assertEquals(expected,actual);
    }

    @When("I check the first Run Daemon check box")
    public void iCheckTheFirstRunDaemonCheckBox() {
        BrowserUtils.wait(3);
        login.firstRD.isSelected();
        BrowserUtils.wait(3);
        
    }

    @Then("I should verify the first checkbox is selected")
    public void iShouldVerifyTheFirstCheckboxIsSelected() {
        BrowserUtils.wait(3);
        if(login.firstRD.isSelected()){
            System.out.println("1st checkbox is selected");
        }else{
            System.out.println("1st checkbox is NOT selected");
        }
        
    }

    @And("I click the second checkbox")
    public void iClickTheSecondCheckbox() {
        BrowserUtils.wait(3);
        login.secondRD.click();
        
    }

    @Then("I verify the second checkbox is selected")
    public void iVerifyTheSecondCheckboxIsSelected() {
        BrowserUtils.wait(3);
        if(!login.secondRD.isSelected()){
            System.out.println("2nd checkbox is not selected");
        }else{
            System.out.println("2nd checkbox is selected");
        }
    }

 */

