package org.example;


import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class myFirstRestAssuredClass {

    @Test
    public void CreateToken() {
        RestAssured.baseURI = jsonInputs.baseURI();
        String createResponse = given().header("Content-Type", "application/json")
                .body(jsonInputs.createToken()).when().post("/auth").then().assertThat().log().body().statusCode(200).extract().asString();

        JsonPath jsp = new JsonPath(createResponse);
        String token = jsp.get("token");
        System.out.println(STR."Auth Token create : \{token}");

    }

    @Test
    public void CreateBooking() {
        RestAssured.baseURI = jsonInputs.baseURI();
        String bookingResp = given().header("Content-Type", "application/json").body(jsonInputs.createBooking())
                .when().post("/booking")
                .then().assertThat().statusCode(200).extract().asString();
        JsonPath jsp = new JsonPath(bookingResp);
        int bookingId = jsp.getInt("bookingid");

        given().header("Content-Type", "application/json").pathParams("id", bookingId)
                .when().get("booking/{id}").then().assertThat().log().body().statusCode(200);


    }

}