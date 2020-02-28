import Pojo.Bookmarks.Bookmarks;
import Pojo.KristalResponse;
import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.Assert;


import java.util.ArrayList;


public class TestSteps {


    //getting otp
    private static ApiController apiController;
    private static String email = "deepakjagdambakumar@gmail.com";
    private static ArrayList<KristalResponse> kritalResponseList;
    private static int kristalId;


  /*  public static void main(String[] args) throws JSONException {
        sendOtp(email);
        getOtp(email);
        getKrystals();
        addKrystalstoBookMark();
        assertBookmarkAdded();
    }*/

    public   void sendOtp(String email) throws JSONException {
        apiController = new ApiController();
        Response response = apiController.sendOtp(email);
    }


    public   void getOtp(String email) throws JSONException {
        Response response = apiController.getOauth(email);

    }

    public   void getKrystals() {
        kritalResponseList = apiController.getKrystals();
    }

    public   void addKrystalstoBookMark() {
        kristalId = kritalResponseList.get(0).getCategory().get(0).getKristals().get(0).getKristalId();
        apiController.addKrystalstoBookMark(kritalResponseList.get(0).getCategory().get(0).getKristals().get(0).getKristalId());
    }

    public   void assertBookmarkAdded(){
        ArrayList<Bookmarks> response = apiController.getBookmarksAdded();
        Assert.assertEquals(kristalId,response.get(0).getKristalId());

    }

}
