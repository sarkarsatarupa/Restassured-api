package Datadriven;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import groovyjarjarasm.asm.commons.Method;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;


public class DataDrivenTesting_AddNewEmployeess {
	
@Test()
void postNewEmployees() 
{
	RestAssured.baseURI="http://test.brigosha.com";
	
	RequestSpecification httpRequest=RestAssured.given();
	
	//
	JSONObject requestParams=new JSONObject();
	requestParams.put("api-version", "6");
	requestParams.put("api-section", "attendance");
	requestParams.put("auth-id", "47");
	requestParams.put("auth-token", "bgsdev");
	
	
	httpRequest.header("Content-Type","appliction/json"); 
	
	httpRequest.body(requestParams.toJSONString());
	
	//Post Request
	Response response=httpRequest.request(Method.POST,"/api/check-in-out");
	
	
	//Capture Response Body To Perform Validations

	String responseBody=response.getBody().asString();
	
	
	//Assert.assertEquals(responseBody.contains(ename),true);
	//Assert.assertEquals(responseBody.contains(esal),true);
	//Assert.assertEquals(responseBody.contains(eage),true);

	System.out.println("Response body is"+ responseBody);
}
/*
@DataProvider
String[][] getEmpData() throws IOException
{
	 //Read data from excel
	String path="C:/Users/Satarupa/Desktop/Restassured API/restAssuredFramework/src/test/java/Datadriven/empdata.xlsx";    
    int	rownum=XLUtils.getRowCount(path,"sheet1");
    int colcount=XLUtils.getCellCount(path,"sheet1",1);
			String empdata[][]= new String[rownum][colcount];
			
			for(int i=1; i<=rownum; i++) {
				
				for(int j=0; j<colcount; j++) {
					
					empdata[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
				}
			}
			return empdata;
		
}
	 */
	
	
}


