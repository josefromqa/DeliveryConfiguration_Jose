package deliveryConfiguration_Jose.step_def;

import deliveryConfiguration_Jose.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.concurrent.TimeUnit;


public class Hooks {



    @Before
    public void setup(){
        System.out.println("::: Starting Automation:::");
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //DriverFactory.getDriver().manage().window().maximize();
        //DriverFactory.getDriver().manage().deleteAllCookies();


    }

    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed

        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());

        }
        //DriverFactory.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");

    }

        //DriverFactory.closeDriver();



    }



