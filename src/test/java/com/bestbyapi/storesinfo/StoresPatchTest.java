package com.bestbyapi.storesinfo;

import com.bestbyapi.model.StoresPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StoresPatchTest extends TestBase {
    @Test
    public void updateStoresWithPatch() {
        StoresPojo storePojo = new StoresPojo();
        storePojo.setName("ema");
        storePojo.setType("funny");
        storePojo.setAddress("23-Dev");
        storePojo.setAddress2("51-Whithron");
        storePojo.setCity("Hopkins");
        storePojo.setZip("55305");
        storePojo.setLat(0);
        storePojo.setLng(0);
        storePojo.setHours("Mon:9-8; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 8930)
                .body(storePojo)
                .when()
                .patch("/stores/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }

}
