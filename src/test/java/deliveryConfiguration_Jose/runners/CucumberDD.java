package deliveryConfiguration_Jose.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features={"src/test/resources/features"},
        glue = {"deliveryConfiguration_Jose/step_def"},
        monochrome = false,
        stepNotifications = false,
        dryRun = false,
        publish = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report-DD.html",
                "json:target/cucumberDD.json",
                "rerun:target/rerunDD.txt",
                "timeline:target/timeline-report-DD",
                "junit:target/cucumber-html-reports/cucumberDD.xml",




        },

        tags = "@DirectDownload"

)


public class CucumberDD {

}