package APITesting.com.org.api;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;


public class weatherGetRequest {

	// This is for a simple get request for getting weather request by city name 
	@Test
	public void Test_0001()
	{
		// Test_001 : Test_Case_01: get weather data for a city
		
		Response responefromget = when(). 
		get("https://api.openweathermap.org/data/2.5/weather?q=Oxford,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		System.out.println(responefromget.getStatusCode());
		
	}
	
	
	
}
