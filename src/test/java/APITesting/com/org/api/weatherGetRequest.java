package APITesting.com.org.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

import static com.jayway.restassured.RestAssured.*;


public class weatherGetRequest {

	// This is for a simple get request for getting weather request by city name WITHOUT PARAMETERIZATION
	@Test
	public void Test_0001()
	{
		// Test_001 : Test_Case_01: get weather data for a city
		
		Response responsefromget = when(). 
		get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		// Check the status code is 200 for successful response 
		Assert.assertEquals(responsefromget.getStatusCode(), 200);
		
		if(responsefromget.getStatusCode()==200)
		{
			System.out.println("REST_API CALL for Test_Case_Num: Success");			
		}
		else
		{
			System.out.println("REST_API CALL for Test_Case_Num: Fail");	
		}
		
	}
	
	
	// This is for a simple get request for getting weather request by city name with parameterisations 
	@Test
	public void Test_0002()
	{
		// Test_001 : Test_Case_01: get weather data for a city
		
				given().
				param("q","London").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather").
				then().
				assertThat().statusCode(200);
		
	}
	
	// This is for a simple get request for getting weather request by city name and how to capture the response data in string
	@Test
	public void Test_0003()
	{
		// Test_001 : Test_Case_01: get weather data for a city
		
			ValidatableResponse responsefromget = given().
				param("q","London").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather").
				then().
				assertThat().statusCode(200);
				
				System.out.println(responsefromget);
		
	}
	
	
	
}
