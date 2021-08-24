package deliveryConfiguration_Jose.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

                "json:target/failed.json",
                "html:target/failed-default-report"

        },

        features = "@target/rerun.txt",
        glue = "deliveryConfiguration_Jose/step_def"

)

public class FailedTestRunner {


}
