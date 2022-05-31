package com.bestbyapi.servicesinfo;

import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesDeleteTest extends TestBase {
    @Test
    public void deleteAllServicesInfo() {
        Response response = given()
                .pathParam("id", "35")
                .when()
                .delete("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }


}
