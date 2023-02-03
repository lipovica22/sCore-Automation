package seleniumCore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager{

    @Override
    public void createDriver() {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.getCapability("start-maximized");
            driver = new EdgeDriver(options);
    }
}

