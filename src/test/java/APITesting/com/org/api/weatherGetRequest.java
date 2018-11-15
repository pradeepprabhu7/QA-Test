package APITesting.com.org.api;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;

import static com.jayway.restassured.RestAssured.*;



public class weatherGetRequest {

	@Test
	// This is for a simple get request for getting weather request by city name WITHOUT PARAMETERIZATION
	public void Test_0001()
	{
		// Test_0001 : Test_Case_01: get weather data for a city
		
		Response responsefromget = when(). 
		get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		// Check the status code is 200 for successful response 
		AssertJUnit.assertEquals(responsefromget.getStatusCode(), 200);
		
		if(responsefromget.getStatusCode()==200)
		{
			System.out.println("REST_API CALL for Test_Case_Num: Success");			
		}
		else
		{
			System.out.println("REST_API CALL for Test_Case_Num: Fail");	
		}
		
	}
	
	@Test
	// This is for a simple get request for getting weather request by city name with parameterisations 
	public void Test_0002()
	{
		// Test_0002 : Test_Case_01: get weather data for a city
		
				given().
				param("q","London").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather").
				then().
				assertThat().statusCode(200);
		
			
	}
	
	@Test
	// This is for a simple get request for getting weather request by city name and how to capture the response data in string
	public void Test_0003()
	{
		
		// Test_0003 : Test_Case_01: get weather data for a city
		Response responsefromget =  given().
	    	    param("q","London").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather");
			
				// Check the status code is 200 for successful response 
				AssertJUnit.assertEquals(responsefromget.getStatusCode(), 200);
					
		System.out.println(responsefromget.asString());
		
	}
	
	@Test
	// This is for a simple get request for getting weather request by passing different parameters and how to capture the response data in string
	public void Test_0004()
	{
		
		// Test_0004 : Test_Case_01: get weather data for Delhi, INDIA
		Response responsefromget =  given().
	    	    param("zip","201010,in").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather");
			
				// Check the status code is 200 for successful response 
				AssertJUnit.assertEquals(responsefromget.getStatusCode(), 200);
					
		System.out.println(responsefromget.asString());
		
	}
	
	
	@Test
	// This is for a simple get request for getting weather request and confirming if the content received is JSON or not 
	public void Test_0005()
	{
		
		// Test_0005 : Test_Case_01: get weather data
				given().
	    	    param("zip","201010,in").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather").
				then().
				contentType("application/JSON");			
			
		
	}
	
	@Test
	// This is for a simple get request for getting weather request and extract content for verification
	public void Test_0006()
	{
		
		// Test_0006 : Test_Case_01: get weather data
		String weatherdesc = given().
	    	    param("zip","201010,in").
				param("appid","b6907d289e10d714a6e88b30761fae22").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather").
				then().
				contentType("application/JSON").
				extract().
				path("weather[0].description","");			
		
		System.out.println("Weather Description:---->"+weatherdesc.toString());
			
		// This is the place where the assertion and more verification of the data from database or datasource directly.  
		
		
	}
	
}
