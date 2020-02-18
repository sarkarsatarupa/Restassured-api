package getRequest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.response.ResponseBody;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

public class GetCallBDD {
@BeforeClass
public void test_numberofCircuits() throws InterruptedException {
	
	
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RequestSpecification httpRequest = RestAssured.given();
	Response response=httpRequest.request(Method.GET,"/employee");
	
	Thread.sleep(3);
	
	
}

@Test

public void checkResponseBody() {
	ResponseBody  responseBody= 
	
}
}
