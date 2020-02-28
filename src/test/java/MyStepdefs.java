import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class MyStepdefs {
    private static ApiController apiController;
    private static TestSteps testSteps;

    @Given("^I am new user with \"([^\"]*)\" and$")
    public void iAmNewUserWithAnd(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apiController = new ApiController();
        testSteps = new TestSteps();
        testSteps.sendOtp(arg0);

        Response response = apiController.sendOtp(arg0);
        response.prettyPrint();
        /*sendOtp(email);
        getOtp(email);
        getKrystals();
        addKrystalstoBookMark();
        assertBookmarkAdded();*/
    }

    @When("^I get Krystals$")
    public void iGetKrystals() {
        testSteps.getKrystals();
    }

    @And("^add kristal to bookmark$")
    public void addKristalToBookmark() {
        testSteps.addKrystalstoBookMark();
    }

    @Then("^assert kristal is added to bookmark$")
    public void assertKristalIsAddedToBookmark() {
        testSteps.assertBookmarkAdded();
    }
}
