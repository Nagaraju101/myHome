package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil{


    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }




   @Before
    public void initializedTest(){

        System.out.println("Test begins here");

       base.stepInfo = " Chrome browser";

    }

    @After
    public void tearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println("\n" +scenario.getStatus());
            System.out.println(scenario.getName());
        }
        else {
        System.out.printf("Test Finished without interruption");
        }
    }
}
