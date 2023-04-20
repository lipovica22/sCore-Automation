package runners.Life;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/features/Life/NewContract.feature",
        glue = "steps/Life/NC",
        plugin ={"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class RSLifeNCrunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
