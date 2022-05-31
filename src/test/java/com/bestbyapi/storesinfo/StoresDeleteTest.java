package com.bestbyapi.storesinfo;


import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StoresDeleteTest extends TestBase {
    @Test
    public void deleteAllStoresInfo() {
        Response response = given()
                .pathParam("id", 8930)
                .when()
                .delete("/stores/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}
