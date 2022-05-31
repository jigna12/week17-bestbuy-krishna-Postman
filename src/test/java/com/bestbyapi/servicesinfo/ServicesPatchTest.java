package com.bestbyapi.servicesinfo;

import com.bestbyapi.model.ServicesPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPatchTest extends TestBase {
    @Test
    public void updateServicesWithPatch() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Nima");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 35)
                .body(servicesPojo)
                .when()
                .patch("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }



}