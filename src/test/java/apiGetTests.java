import config.testConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class apiGetTests extends testConfig {

    @Test
    public void getBookTitle(){
        given().log().all().when().get("Books/4").then().body("Title",equalTo("Book 4")).log().all();

        RequestSpecification requestSpecification = new RequestSpecBuilder().build();

        RestAssured.requestSpecification = requestSpecification;

        ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();

        RestAssured.responseSpecification = responseSpecification;

    }

    @Test
    public void getUser(){
        given().log().all().when().get("Users/7").then().body("UserName",equalTo("User 7")).log().all();

        RequestSpecification requestSpecification = new RequestSpecBuilder().build();

        RestAssured.requestSpecification = requestSpecification;

        ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();

        RestAssured.responseSpecification = responseSpecification;

    }


}
