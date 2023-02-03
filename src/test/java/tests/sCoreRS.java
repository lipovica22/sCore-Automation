package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sCoreRS extends baseTest{

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) throws Exception{
        initialization(browser);
    }


    @AfterMethod
    public void tearDown(){
        quit();
    }


    @Test
    public void lifeRS() {
        System.out.println("test");
    }




}
