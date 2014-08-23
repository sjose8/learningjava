package com.bitbucket.learningjava

import com.jayway.restassured.RestAssured._
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification

/**
 * Created by amit on 8/22/14.
 */
class BookServiceSpec extends AcceptanceSpec {
  info("As a book service user")
  info("I want to be able to create, get,update, delete a book")

  feature("Book Service Test") {
    scenario("Create a new book") {
      Given("Request Content type is set up corectly")
      val requestSpecification: RequestSpecification = com.jayway.restassured.RestAssured.given.contentType("application/json").log.all.request()
      When("Make a Create Request")
      val response: Response = requestSpecification.body("{\"ISBN\":\"12345\",\"title\":\"Along Came A kite\"}").post("http://localhost:8080/RESTService/books")
      Then("Created book with right status ")
      response.then.log.all.statusCode(201)
    }
  }

}
