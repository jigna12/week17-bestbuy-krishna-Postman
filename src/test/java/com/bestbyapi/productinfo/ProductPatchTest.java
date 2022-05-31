package com.bestbyapi.productinfo;


import com.bestbyapi.model.ProductPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductPatchTest extends TestBase {

    @Test
    public void updateProductWithPatch(){
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("Zinc Battery");
        productPojo.setType("Fast Rechargeable");
        productPojo.setPrice(55);
        productPojo.setShipping(11);



        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 9999686)
                .body(productPojo)
                .when()
                .patch("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}