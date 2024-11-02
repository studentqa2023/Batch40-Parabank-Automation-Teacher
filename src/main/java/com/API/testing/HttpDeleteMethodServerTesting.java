package com.API.testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class HttpDeleteMethodServerTesting {
	
	Response response;
	
	@BeforeTest
	public void getSetup() {
		response = RestAssured.delete("http://localhost:3000/posts/31");
	}
	
	@Test
	public  void  getStatusCode() {
		System.out.println("Status code = "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void getContentType() {
		System.out.println("Content type = "+response.getContentType());
		Assert.assertTrue(response.getContentType().contains("json"));
	}
	
	@Test
	public void getResponseTime() {
		System.out.println("Response time = "+response.getTime());
		Assert.assertTrue(response.getTime()<500);
	}

}
