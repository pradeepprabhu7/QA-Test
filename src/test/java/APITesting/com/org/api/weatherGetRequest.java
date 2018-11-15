package APITesting.com.org.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;


public class weatherGetRequest {

	// This is for a simple get request for getting weather request by city name WITHOUT PARAMETERIZATION
	@Test
	public void Test_0001()
	{
		// Test_001 : Test_Case_01: get weather data for a city
		
		Response responefromget = when(). 
		get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		// Check the status code is 200 for successful response 
		Assert.assertEquals(responefromget.getStatusCode(), 200);
		
		if(responefromget.getStatusCode()==200)
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
	
	
}
