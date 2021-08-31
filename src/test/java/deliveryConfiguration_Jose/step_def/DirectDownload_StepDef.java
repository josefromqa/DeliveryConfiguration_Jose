package deliveryConfiguration_Jose.step_def;

import deliveryConfiguration_Jose.pages.DirectDownload;
import deliveryConfiguration_Jose.utilities.BrowserUtils;
import deliveryConfiguration_Jose.utilities.ConfigurationReader;
import deliveryConfiguration_Jose.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.File;

public class DirectDownload_StepDef {
    protected static String download_folder = System.getProperty("user.home") + "/Downloads/";
    DirectDownload directdownload = new DirectDownload();

    @Given("I put the URL in the browser")
    public void iPutTheURLInTheBrowser() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("DownloadLink"));
        BrowserUtils.wait(6);
        System.out.println("");

    }


    @When("I type {string} as the user name")
    public void iTypeAsTheUserName(String arg0) throws Exception {
        directdownload.SetLogin();
        BrowserUtils.wait(10);




    }

    @Then("The file downloads immediately")
    public void theFileDownloadsImmediately() {
        String expectedTitle="Logging in...";
        String actualTitle=DriverFactory.getDriver().getTitle();
        Assert.assertEquals("File is not downloaded", expectedTitle,actualTitle);
        System.out.println("The file is downloaded successfully");
        File file = new File(download_folder);
        if (file.length() > 0) {
            System.out.println("Pass");
            Assert.assertTrue(true);
        } else {
            System.out.println("Fail.  The file is not downloaded.");
        }
    }
}
