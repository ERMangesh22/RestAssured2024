package restAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class restAssuredtest1 {
	
	@Test
	public void test1() {
		
		
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		int statusCode =response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void test2() {
		
//		baseURI="https://reqres.in/api";
//		given().get("/users?page=2").then().statusCode(200)
//		.body("support.url",equalTo("https://reqres.in/#support-heading"));
		
		Response response =given().when().get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		//return response;
		System.out.println(response.asString());
		
	}
	

	
}
