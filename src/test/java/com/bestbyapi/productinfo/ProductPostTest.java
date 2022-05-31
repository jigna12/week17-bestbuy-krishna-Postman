package com.bestbyapi.productinfo;

import com.bestbyapi.model.ProductPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPostTest extends TestBase {

    @Test
    public void createProduct() {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("Energizer - MAX Batteries AA (4-Pack)");
        productPojo.setType("HardGood");
        productPojo.setPrice(0);
        productPojo.setShipping(0);
        productPojo.setUpc("039800011329");
        productPojo.setDescription("4-pack AA alkaline batteries; battery tester included");
        productPojo.setManufacturer("Energizer");
        productPojo.setModel("E91BP-4");
        productPojo.setUrl("http://www.bestbuy.com/site/energizer-max-batteries-aa-4-pack/150115.p?id=1051384046217%26skuId=150115%26cmp=RMXCC");
        productPojo.setImage("facebook.com");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productPojo)
                .when()
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);


    }
    }