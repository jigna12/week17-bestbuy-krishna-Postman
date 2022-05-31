package com.bestbyapi.utilitiesinfo;

import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class utilitiesGetTest extends TestBase {

    @Test
    public void getAllutilitiesInfo() {
        Response response = given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getAllutilitiesInfo1() {
        Response response = given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    }


