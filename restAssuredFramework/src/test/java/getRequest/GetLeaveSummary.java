package getRequest;

//import static com.jayway.restassured.RestAssured.given;



import java.util.HashMap;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.jayway.restassured.response.ResponseBodyData;
//import com.jayway.restassured.response.ValidatableResponse;

import io.restassured.RestAssured;

import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import org.junit.runner.Request;
import org.testng.Assert;


import groovyjarjarasm.asm.commons.Method;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;

//import static io.restassured.RestAssured.given;


import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.Map;
public class GetLeaveSummary {	
	public static HashMap map=new HashMap();
	RequestSpecification httpRequest=RestAssured.given();
	  @BeforeClass
		 public void testGet()
		 {
	    	RestAssured.useRelaxedHTTPSValidation();
			 map.put("api-version", "6");
			 map.put("api-section", "projects");
			 map.put("auth-id", "1");
			 map.put("auth-token", "bgsdev"); 
		 }
	    @Test
	    public void test() {
	    	RestAssured.useRelaxedHTTPSValidation();
	    	given()
	    
	    	.headers(map)
	        //.param("type", 1)
	    	.when()
	    	.get("https://test.brigosha.com/api/notifications?type=1")
	        .then()
	        .header("Content-Type", "application/json")
	    
	    .statusCode(200);
	     }
	    @Test
	    public void LeaveSummaryBody() throws InterruptedException 
	    {
	     RestAssured.baseURI = "https://test.brigosha.com/api/notifications?type=1";
	     RequestSpecification httpRequest = RestAssured.given();
	     httpRequest.header("api-version", "6");
	     httpRequest.header("api-section", "projects");
	     httpRequest.header("auth-id", "1");
	     httpRequest.header("auth-token", "bgsdev");
	    // httpRequest.param("type",1);
	     
	 // Retrieve the body of the Response
	  // By using the ResponseBody.asString() method, we can convert the  body
	     // into the string representation.
	     Thread.sleep(1000);
	     Response response=httpRequest.request(io.restassured.http.Method.GET," ").then().extract().path("records[0].id");
	   // String responseBody=response.getBody().asString();
	     
	   // JsonPath responseBody= response.jsonPath();
	     //System.out.println("Response body is"+ responseBody);
	     Thread.sleep(1000);
	     response.prettyPrint();
	     int l=response.asString().length();
	     System.out.println(l);
	     
	    for(int i=0;i<l;i++) 
	    	
	    	System.out.println(response[i]+ " ");
	    
	  
	 
        }

	     	
	     //System.out.println("length "+responseBody.length()) ;
		 	 
}

