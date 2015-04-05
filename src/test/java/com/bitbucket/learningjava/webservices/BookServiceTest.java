package com.bitbucket.learningjava.webservices;

import org.junit.Ignore;
import org.junit.Test;
import com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by amit on 8/20/14.
 */
public class BookServiceTest {

    @Test
    @Ignore
    public void testWebServiceHappyPath(){
        given().contentType("application/json").log().all()
                .request().body("{\"ISBN\":\"12345\",\"title\":\"Along Came A kite\"}")
                .post("http://localhost:8080/RESTService/books")
                .then().log().all().statusCode(201);

        //Now do a GET. Check if everything is good. Status cde = 200
        //Now do a PUT. Check if everything is good. Status cde = 200
        //Now do a DELETE. Check if everything is good. Status cde = 204
    }

    //Add a test method for GET with a bad URL. CHeck for Status Code 404
    //Add a test method for PUT with a bad URL. CHeck for Status Code 404. Use   Body from POST.
    //URL has ID
    //Add a test method for DELETE with a bad URL. CHeck for Status Code 404. URL has ID
}