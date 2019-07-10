package config;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.runner.Request;

public class testConfig {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI="https://fakerestapi.azurewebsites.net";
        RestAssured.basePath="/api/";

        RequestSpecification requestSpecification = new RequestSpecBuilder().
                addHeader("Content-Type","application/json").
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = requestSpecification;
    }
}
