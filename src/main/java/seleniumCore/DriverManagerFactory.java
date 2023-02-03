package seleniumCore;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(String type) throws Exception{
        DriverManager driverManager;
        type = type.toUpperCase();

        switch (type) {
            case "CHROME": {
                driverManager=new ChromeDriverManager();
            }
            break;
            case "EDGE": {
                driverManager=new EdgeDriverManager();
            }
            break;
            default:driverManager=new ChromeDriverManager();
        }
        return driverManager;
    }
}
