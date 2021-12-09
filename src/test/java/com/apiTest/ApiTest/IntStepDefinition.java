package com.apiTest.ApiTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.response.*;

public class IntStepDefinition {
	@SuppressWarnings("deprecation")
	public void checkTest() {
	
		RestAssured.baseURI="https://google.com";
		
		RequestSpecification request = RestAssured.given();
		
		Response response= request.body("payload").post("/account");
		
		String conresponse= response.asString();
		
		String getToken=JsonPath.from(conresponse).getString("courses[3].copies");
	}
}
