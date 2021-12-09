package com.apiTest.ApiTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Apitest {
	//BaseURI baseURI;
	private final String BASE_URL="https://google.com";
	Response response;
	
	public void iAmAnAuthorizedUser() {
	RestAssured.baseURI = BASE_URL;
	RequestSpecification request=RestAssured.given();
	request.header("Content-Type","application/json");
	String payload="username:user";
	response= request.body(payload).post("/accounts");
	response.getStatusCode();
	String convertresponse =response.asString();
	String token=JsonPath.from(convertresponse).getString("convertresponse");
	
	}
	
	public void get() {
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		String payload="username:user";
		response= request.body(payload).get();
		response.getStatusCode();
		String convertresponse =response.asString();
		String token=JsonPath.from(convertresponse).getString("convertresponse");
		
		}

	public static void main(String aa[]) {
		Apitest n = new Apitest();
		n.iAmAnAuthorizedUser();
	}
		
	}