package com.finWorks.step_defs;


import com.finWorks.utilties.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //public void setupScenario(){    }


    //public void setupScenarioForLogins(){}

    //@Before (value = "@db", order = 0)
   //public void setupForDatabaseScenarios(){    }


    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();


    }

    // @BeforeStep
   // public void setupStep(){
        //System.out.println("--------> applying setup using @BeforeStep");  }

    //@AfterStep
    //public void afterStep(){System.out.println("--------> applying tearDown using @AfterStep");}

}
