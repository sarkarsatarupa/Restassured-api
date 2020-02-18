package com.restassuredapi.base;

import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
public static RequestSpecification httpRequest;
public static Response response;
public String auth_id="47";



@BeforeClass
public void setup() {
	
}



}
