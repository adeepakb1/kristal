import Pojo.Bookmarks.Bookmarks;
import Pojo.KristalResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ApiController {
    private static Logger log = LoggerFactory.getLogger(ApiController.class);

    public Response sendOtp(String email) throws JSONException {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://services.investo2o.com");
        setHeaders(request);
        JSONObject jo = new JSONObject();
        jo.put("phoneNumberCountryCode", "91");
        jo.put("phoneNumber", "");
        jo.put("email", email);
        jo.put("communicationType", "EMAIL");
        request.body(jo.toString());
        Response response = request.post("/auth-ws/api/v1/generateOtpForVerificationOnSignup");
        response.prettyPrint();
        return response;
    }


    private void setHeaders(RequestSpecification request) {
        request.header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:73.0) Gecko/20100101 Firefox/73.0");
        request.header(":path", "/auth-ws/api/v1/generateOtpForVerificationOnSignup");
        request.header(":authority", "services.investo2o.com");
        request.header(":scheme", "https");
        request.header("accept", "*/*");
        request.header("accept-language", "en-US,en;q=0.5");
        request.header("accept-encoding", "gzip, deflate, br");
        request.header("referer", "https://accounts.kristal.ai/signup?country=IND&gid=undefined&lang=EN_US&platform=WEBSITE_WP&refCode=pageid_708&sol=PREMIUM&stage=signupForm");
        request.header("content-type", "application/json");
        request.header("platform_code", "WEBSITE");
        request.header("agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:73.0) Gecko/20100101 Firefox/73.0");
        request.header("user-ip", "106.51.78.109");
        request.header("origin", "https://accounts.kristal.ai");
        // request.header("content-length", "12");
        request.header("te", "trailers");
    }


    public Response getOtp(String email) {

        RequestSpecification request = RestAssured.given();
        request.baseUri("https://accounts.google.com");
        request.queryParam("client_id", "298464407165-nq92hadbf00or02r97enmr7bda583v2v.apps.googleusercontent.com");

        request.queryParam("response_type", "code");
        request.queryParam("scope", "https://www.googleapis.com/auth/gmail.compose");
        request.queryParam("access_type", "offline");
        request.queryParam("redirect_uri", "http://localhost");

        Response response = request.get("/o/oauth2/v2/auth");
        response.prettyPrint();
        return response;
    }

    public Response getOauth(String email) throws JSONException {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://services.investo2o.com");
        JSONObject jo = new JSONObject();
        jo.put("PHONE_NUMBER_COUNTRY_CODE", "");
        jo.put("COMPLETE_PHONE_NUMBER", "");
        jo.put("username", email);
        jo.put("password", "a+M2usoHK9xiYbJeiRkW/Z6dCMC3YzXo7zpe6HJmGBo8UwO8wEgXfdiXx//sD+ZmIrxx07Ibdigw9WIwiT9ShA==");
        jo.put("flow", "LOGIN");
        jo.put("LOGIN_TYPE", "EMAIL");
        jo.put("WEB_TRACKING_ID", "");

        request.body(jo.toString());
        setHeaders(request);
        Response response = request.post("/auth-ws/kristal/v2/oauth");
        // Assert.assertEquals(response.getStatusCode(),"200");
        if (response.getStatusCode() == 200) {
            Assert.assertNotNull(response.jsonPath().getString("redirect"));
            log.info(response.jsonPath().getString("redirect"));
        } else {
            log.error("response code is: " + response.getStatusCode());
        }
        response.prettyPrint();
        return response;
    }

    public ArrayList<KristalResponse> getKrystals() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://services.investo2o.com");
        setHeaders(request);
        request.header("access-token", "NzA0ZWI0YWEtZTcwMS00NTFiLTk0OWEtZGM3NDA4YzM2ZTJiJVVTRVIlMTkxMzI=");
        //seems like access token is being decrypted form response so i am not able to send access token dynamically
        request.header("user-id", "19132");
        Response response = request.get("/kristals-ws/api/v3/kristals/getApprovedKristal");
        Gson gson = new Gson();

        Type kristalListType = new TypeToken<ArrayList<KristalResponse>>() {
        }.getType();
        ArrayList<KristalResponse> kristalArray = gson.fromJson(response.asString(), kristalListType);
        return kristalArray;
    }

    public void addKrystalstoBookMark(int krystalId) {
        // https://services.investo2o.com/kristals-ws/api/v2/kristals/addKristalToWatchList?kristalId=2421
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://services.investo2o.com");
        setHeaders(request);
        request.header("access-token", "NzA0ZWI0YWEtZTcwMS00NTFiLTk0OWEtZGM3NDA4YzM2ZTJiJVVTRVIlMTkxMzI=");
        //seems like access token is being decrypted form response so i am not able to send access token dynamically
        request.header("user-id", "19132");
        request.queryParam("kristalId", krystalId);
        Response response = request.post("/kristals-ws/api/v2/kristals/addKristalToWatchList");

    }


    public ArrayList<Bookmarks> getBookmarksAdded() {
        //https://services.investo2o.com/kristals-ws/api/v2/kristals/getKristalWatchList

        RequestSpecification request = RestAssured.given();
        request.baseUri("https://services.investo2o.com");
        setHeaders(request);
        request.header("access-token", "NzA0ZWI0YWEtZTcwMS00NTFiLTk0OWEtZGM3NDA4YzM2ZTJiJVVTRVIlMTkxMzI=");
        //seems like access token is being decrypted form response so i am not able to send access token dynamically
        request.header("user-id", "19132");
        Response response = request.get("/kristals-ws/api/v2/kristals/getKristalWatchList");
        Gson gson = new Gson();
        Type bookmarkType = new TypeToken<ArrayList<Bookmarks>>() {
        }.getType();
        ArrayList<Bookmarks> kristalArray = gson.fromJson(response.asString(), bookmarkType);
        return kristalArray;
    }
}
