package com.finWorks.step_defs;

import com.finWorks.utilties.DBUtils_Buelent;
import com.finWorks.utilties.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

/*
In the class we will be able to pass pre and post conditions to each scenario and each step
 */

public class Hooks_Buelent {

    @Before
    public void setUp(){
        System.out.println("\tTest is starting.......");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("\tTest is terminating.......");
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        //  Driver.closeDriver();
        Driver.getDriver().quit();

    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("Connecting to database...");
        DBUtils_Buelent.createConnection();
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("Database connection is terminating...");
        DBUtils_Buelent.destroy();
    }



}
