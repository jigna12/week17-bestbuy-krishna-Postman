package com.bestbyapi.categoriesinfo;

import com.bestbyapi.model.CategoriesPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBase {
    @Test
     public void createCategories() {

        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Nima");
        categoriesPojo.setId("abcat0010001");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.prettyPrint();
        response.then().statusCode(201);


    }
    }