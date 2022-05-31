package com.bestbyapi.productinfo;

import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;


public class ProductGetTest extends TestBase {

    @Test
    public void getAllProductInfo() {
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleProductInfo() {
        Response response = given()
                .pathParam("id",150115)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


    }


