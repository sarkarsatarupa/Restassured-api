package com.restassuredapi.base;

import java.util.HashMap;


import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
public static RequestSpecification httpRequest;
public static Response response; 
public String auth_id="47";



@BeforeClass
public void setup() { 
	HashMap map=new HashMap();
	RestAssured.useRelaxedHTTPSValidation();
	 map.put("api-version", "6");
	 map.put("api-section", "projects");
	 map.put("auth-id", "47");
	 map.put("auth-token", "bgsdev"); 
	
}



}
