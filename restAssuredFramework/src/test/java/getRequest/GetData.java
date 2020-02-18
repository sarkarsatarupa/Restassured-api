package getRequest;



import org.json.simple.JSONObject;


import org.junit.runner.Request;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import groovyjarjarasm.asm.commons.Method;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;

//import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;



public class GetData {
 
	/*
@Test
 //public void getuserCalendar() {
	
	
	RestAssured.useRelaxedHTTPSValidation();

	//specify base URI
		 RestAssured.baseURI=("https://test.brigosha.com/api/calendar?year_month=December-2019&page=1");
		 	 
   //Request Object
	//RequestSpecification httpRequest=RestAssured.given();
	
	JSONObject requestparams=new JSONObject();
	//given().header("auth-id","47","auth-token","bgsdev","api-version", "6");
	//.header("auth-id","47")
	//.header("auth-token","bgsdev")
	//.header("api-version","6");
	
	
	//Response Object
	Response response=httpRequest.request(io.restassured.http.Method.GET,"");
	
	//print response in console
	String responseBody=response.getBody().asString();
	
	System.out.println("Response body is"+ responseBody);
	

	/*RestAssured.baseURI="https://test.brigosha.com/api/calendar";
	RequestSpecification httpRequest=RestAssured.given();
	JSONObject requestparams=new JSONObject();
		
    given().
    auth().preemptive().basic("api-version", "6").
        header("api-section", "attendance").header("auth-id",47).header("auth-token","bgsdev"). 
        param("year_month", "December-2019").
        param("page", "1");
 
    when().
       get("/api/calendar").
   then().equals("200");
    Response response=httpRequest.request(io.restassured.http.Method.GET,"");
String responseBody=response.getBody().asString();
	
System.out.println("Response body is"+ responseBody);
	
	/*
	Unirest.setTimeouts(0, 0);
	HttpResponse<String> response = Unirest.get("https://test.brigosha.com/api/calendar?year_month=December-2019&page=0")
	  .header("api-section", "attendance")
	  .header("api-version", "6")
	  .header("auth-id", "47")
	  .header("auth-token", "bgsdev")
	  .multiPartContent()  .asString();
*/
public static HashMap map=new HashMap();
RequestSpecification httpRequest=RestAssured.given();
    @BeforeClass
	 public void testGet()
	 {
		 map.put("api-version", "6");
		 map.put("api-section", "projects");
		 map.put("auth-id", "47");
		 map.put("auth-token", "bgsdev"); 
		 RestAssured.baseURI="https://test.brigosha.com/api/leave";
		 
	 }
    @Test
    public void test() {
    	given()
    	.contentType("application/json")
    	.headers(map)
    	.when()
    	.then();
    	
    	//.statusCode(200);
    	Response response=httpRequest.request(io.restassured.http.Method.GET,"");
    	String responseBody=response.getBody().asString();
    		
    	System.out.println("Response body is"+ responseBody);
		 
		 
	 }
	
    }
	

