package com.bestbyapi.productinfo;


import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductDeleteTest extends TestBase {

    @Test
    public void deleteAllProductInfo() {
        Response response = given()
                .pathParam("id",9999686)
                .when()
                .delete("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}



