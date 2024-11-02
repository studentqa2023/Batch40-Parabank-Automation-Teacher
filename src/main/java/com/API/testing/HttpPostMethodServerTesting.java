package com.API.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.mongodb.util.JSON;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpPostMethodServerTesting {
	
	@Test
	public void getPost() {
		
		//1st => add test data = JsonObject class and  addProperty()
		JsonObject json = new JsonObject();
		
		//json.addProperty("key", "value")
		json.addProperty("Name", "Tasmim");
		json.addProperty("Profession", "API  Tester");
		json.addProperty("City", "Jackson  Heights");
		
		//2nd => RequestSpecification and add data inside the body
		RequestSpecification rsf = RestAssured.given();
		rsf.header("Content-Type", "application/json");
		rsf.body(json.toString());//passing the data inside the message body in Json format
		
		//3rd => Pass the URL
		Response response = rsf.post("http://localhost:3000/posts");
		
		//4th => Validate
		System.out.println("Status code = "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 201);
		
		System.out.println("Content type = "+response.getContentType());
		Assert.assertEquals(response.getContentType(), "application/json");
		
		System.out.println("Response time = "+response.getTime());
		Assert.assertTrue(response.getTime()<500);
		
		System.out.println("Is response null or not = "+response.toString()!=null);
		Assert.assertTrue(response.toString()!=null);
		
	}
}
