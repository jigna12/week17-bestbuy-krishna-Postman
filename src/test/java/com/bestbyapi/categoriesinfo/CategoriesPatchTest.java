package com.bestbyapi.categoriesinfo;



import com.bestbyapi.model.CategoriesPojo;
import com.bestbyapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPatchTest extends TestBase {
@Test
    public void updateCategoriesWithPatch(){
    CategoriesPojo categoriesPojo = new CategoriesPojo();
    categoriesPojo.setName("Nima");

    Response response = given()
            .header("Content-Type", "application/json")
            .pathParams("id","kyu2")
            .body(categoriesPojo)
            .when()
            .patch("/categories/{id}");
    response.prettyPrint();
    response.then().statusCode(200);
}

}