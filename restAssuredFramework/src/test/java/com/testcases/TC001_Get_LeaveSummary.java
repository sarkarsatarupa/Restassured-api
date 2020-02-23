package com.testcases;

import org.testng.annotations.BeforeClass;

import com.restassuredapi.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_Get_LeaveSummary extends TestBase{
	
	RequestSpecification httpRequest;
	Response response;
	@BeforeClass()
	void getLeaveSummary() throws InterruptedException {
	RestAssured.baseURI = "https://test.brigosha.com/api/leave";
	httpRequest=RestAssured.given();
	response=httpRequest.request(io.restassured.http.Method.GET," ");
	
	
    String responseBody=response.getBody().asString();
    //JsonPath responseBody= response.jsonPath();
     System.out.println("Response body is"+ responseBody);
     Thread.sleep(1000);
       
    // System.out.println("id is"+ responseBody.get("Leave.user_id"));
    
 
	}
}


