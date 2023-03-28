package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/Health",
        glue = "steps/Health",
        plugin ={"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class HealthTravelAssistance extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
