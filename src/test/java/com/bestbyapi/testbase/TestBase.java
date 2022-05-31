package com.bestbyapi.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        //RestAssured.basePath = "/product";
        //RestAssured.basePath = "/stores";
       // RestAssured.basePath = "/services";
       // RestAssured.basePath = "/utilities";
       // RestAssured.basePath = "/categories";
    }

}
