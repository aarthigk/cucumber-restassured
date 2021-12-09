package com.apiTest.ApiTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Caller {
	Response response;
//	@Test
//	public void test() throws JsonProcessingException {
//		Employee e = new Employee();
//		e.setId(1);
//		e.setFirstName("Aathi");
//		e.setLastName("g");
//		//e.getId();
//		
//		// Converting a Java class object to a JSON payload as string
//		ObjectMapper o= new ObjectMapper();
//		String employeejson=o.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//		System.out.println(employeejson);
//		
//		RestAssured.baseURI="https://goole.com";
//		RequestSpecification request=RestAssured.given();
//		request.header("Content","application/json");
//		response =request.body(employeejson).post("/books");
//	
//	}
//	
	@Test
	public void testComplex() throws JsonProcessingException {
		
		ComplexEmp c= new ComplexEmp();
		
		Employee e3 = new Employee();
		e3.setId(1);
		e3.setFirstName("Aathi");
		e3.setLastName("g");
		
		Employee e1 = new Employee();
		e1.setId(11);
		e1.setFirstName("Simr");
		e1.setLastName("g");
		
		Employee e2 = new Employee();
		e2.setId(111);
		e2.setFirstName("Scoob");
		e2.setLastName("g");
		
		
		List<Employee> all = new ArrayList();
		all.add(e1);
		all.add(e2);
		all.add(e3);
		
		c.setEmployee(all);
		
//		c.employee.add(e3);
//		c.employee.add(e1);
//		c.employee.add(e2);
	c.setCompanyName("aarthi");
	c.setCompanyHOCity("bangaore");
	c.setCompanyCEO("Simr");
		
		ObjectMapper o= new ObjectMapper();
		String convertCompljson= o.writerWithDefaultPrettyPrinter().writeValueAsString(c);
		System.out.println(convertCompljson);
	}
	
	

}
