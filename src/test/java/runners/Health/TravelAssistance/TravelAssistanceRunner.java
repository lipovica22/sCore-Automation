package runners.Health.TravelAssistance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/Health/TravelAssistance",
        glue = "steps/Health/TravelAssistance",
        plugin ={"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class TravelAssistanceRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
