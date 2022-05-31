package com.bestbyapi.servicesinfo;

import com.bestbyapi.model.ServicesPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPostTest extends TestBase {

    @Test
    public void createServices() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Nima");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}