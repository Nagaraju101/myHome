package steps;

import Base.BaseUtil;
import Transformation.TransfermationInfo;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.List;

public class LoginStep extends BaseUtil{


    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }
    @And("^I should see the userform$")
    public void iShouldSeeTheUserform() throws Throwable {

        System.out.println("The browser is "+ base.stepInfo);

    }

    @Given("^I navigates to a webpage$")
    public void iNavigatesToAWebpage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    @And("^I enter the following details$")
    public void iEnterTheFollowingDetails(DataTable table) throws Throwable {
        List<List<String>>  data =  table.raw();

     System.out.println("\n" +data.get(1).get(0));
     System.out.println(data.get(1).get(1));
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String user, String pwd) throws Throwable {

        System.out.println("\nThe username is  "+ user );
        System.out.println("The pswd is "+ pwd);
    }

    @And("^I enter my Email: ([^\"]*)$")
    public void iEnterMyEmailAdmin(@Transform(TransfermationInfo.class) String email) throws Throwable {

        System.out.println("The email is : "+  email);

    }
}
