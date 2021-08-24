package deliveryConfiguration_Jose.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features={"src/test/resources/features"},
        glue = {"deliveryConfiguration_Jose/step_def"},
        monochrome = false,
        strict = true,
        stepNotifications = false,
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "timeline:target/timeline-report",
                "junit:target/cucumber-html-reports/cucumber.xml",




        },

        //tags = "@Login or @MyReports"
        tags = "@DirectDownload"

)


public class CucumberRunner {






}
