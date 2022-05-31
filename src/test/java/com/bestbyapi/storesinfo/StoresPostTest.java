package com.bestbyapi.storesinfo;

import com.bestbyapi.model.StoresPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPostTest extends TestBase {
    @Test
    public void createStores() {

        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setName("Palak");
        storesPojo.setType("Big fat");
        storesPojo.setAddress("23-Dev");
        storesPojo.setAddress2("51-Whithron");
        storesPojo.setCity("Ahmedabad");
        storesPojo.setState("Gujarat");
        storesPojo.setZip("Ub78lp");
        storesPojo.setLat(0);
        storesPojo.setLng(0);
        storesPojo.setHours("Mon:9-8; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(storesPojo)
                .when()
                .post("/stores");
        response.prettyPrint();
        response.then().statusCode(201);


    }

}

