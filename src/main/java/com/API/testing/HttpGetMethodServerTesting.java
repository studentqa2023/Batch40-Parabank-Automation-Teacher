package com.API.testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class HttpGetMethodServerTesting {
	
	Response response;
	
	@BeforeTest
	public void getSetup() {
		response = RestAssured.get("http://localhost:3000/posts");
	}
	
	@Test
	public  void  getStatusCode() {
		System.out.println("Status code = "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void getContentType() {
		System.out.println("Content type = "+response.getContentType());
		Assert.assertEquals(response.getContentType(), "application/json");
		Assert.assertTrue(response.getContentType().contains("json"));
	}
	
	@Test
	public void getResponseTime() {
		System.out.println("Response time = "+response.getTime());
		Assert.assertTrue(response.getTime()<500);
	}
	
	@Test
	public void getResponseNullOrNot() {
		System.out.println("Is response null or not = "+response.toString()!=null);
		Assert.assertTrue(response.toString()!=null);
	}
	
}
