import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;

public class MyStepdefs {

    private static ApiController apiController;



    @Given("^I am new user with \"([^\"]*)\" and$")
    public void iAmNewUserWithAnd(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apiController=new ApiController();
        Response response = apiController.sendOtp(arg0);
        response.prettyPrint();
    }
}
