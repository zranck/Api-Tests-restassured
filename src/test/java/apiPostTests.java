import config.testConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class apiPostTests extends testConfig {

    @Test
    public void createCoolUser(){

        String userBodyJson = "{\n" +
                "  \"ID\": 1337,\n" +
                "  \"UserName\": \"Observe\",\n" +
                "  \"Password\": \"Point\"\n" +
                "}";

        given().
                body(userBodyJson).
                log().
                all().
                when().
                post("Users").
                then().
                log().
                all();
        RequestSpecification requestSpecification = new RequestSpecBuilder().build();

        RestAssured.requestSpecification = requestSpecification;

    }

    @Test
    public void createImportantBook(){

        String bookBodyJson = "{\n" +
                "  \"ID\": 0,\n" +
                "  \"Title\": \"Zac Ranck\",\n" +
                "  \"Description\": \"You Should Hire Him\",\n" +
                "  \"PageCount\": 200,\n" +
                "  \"Excerpt\": \"string\",\n" +
                "  \"PublishDate\": \"2019-07-09T22:38:50.292Z\"\n" +
                "}";

        given().
                body(bookBodyJson).
                log().
                all().
                when().
                post("Books").
                then().
                log().
                all();
        RequestSpecification requestSpecification = new RequestSpecBuilder().build();

        RestAssured.requestSpecification = requestSpecification;

    }
}
