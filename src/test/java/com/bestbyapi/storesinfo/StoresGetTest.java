package com.bestbyapi.storesinfo;

import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class StoresGetTest extends TestBase {

    @Test
    public void getAllStoresInfo() {
        Response response = given()
                .when()
                .get("/stores");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleStoresInfo() {
        HashMap<String,Object> qParams = new HashMap<>();
        qParams.put("$limit",1);
        qParams.put("$skip",1);
        Response response = given()
                .queryParams(qParams)
                .when()
                .get("/stores");
        response.prettyPrint();
        response.then().statusCode(200);

    }
    }


