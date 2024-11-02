package com.API.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpPatchMethodServerTesting {
	
	@Test
	public void getPatch() {
		
		//1st => add test data = JsonObject class and  addProperty()
		JsonObject json = new JsonObject();
		
		//json.addProperty("key", "value")
		json.addProperty("City", "Orlando");
		json.addProperty("Email", "abc@er.com");
		
		//2nd => RequestSpecification and add data inside the body
		RequestSpecification rsf = RestAssured.given();
		rsf.header("Content-Type", "application/json");
		rsf.body(json.toString());//passing the data inside the message body in Json format
		
		//3rd => Pass the URL
		Response response = rsf.patch("http://localhost:3000/posts/0270");
		
		//4th => Validate
		System.out.println("Status code = "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println("Content type = "+response.getContentType());
		Assert.assertEquals(response.getContentType(), "application/json");
		
		System.out.println("Response time = "+response.getTime());
		Assert.assertTrue(response.getTime()<500);
		
		System.out.println("Is response null or not = "+response.toString()!=null);
		Assert.assertTrue(response.toString()!=null);
		
	}

}
