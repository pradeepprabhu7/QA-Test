# QA-Test

Pre-requisites and Steps to run in Eclipse or other IDE:
- Currently used REST API calls that are open to access by public in https://openweathermap.org/
- Need to find the appid used in all GET API calls which is unique for each PC. To find the app id  first open the following URL https://openweathermap.org/current and click any API calls listed	and appid will be listed against update the appid here 
- Have used RESTAssured framework for automating tests
- used TestNG plugin in eclipse for test execution  
- used Maven plugin for managing the build and deployment

I have created 6 basic functions for testing GET API requests:
TEST_0001() - is a simple function used for testing a simple get request receiving weather info by city name WITHOUT PARAMETERIZATION
TEST_0002() - is a simple function used for testing simple get request receiving weather info by city name WITH PARAMETERIZATION
TEST_0003()-  is a simple function used for testing simple get request receiving weather info by city name and how to capture the response data in string.
TEST_0004()-  is a simple function used for testing simple GET request receiving weather info by city name by passing different parameters and how to capture the response data in string
TEST_0005()-  is a simple function used for testing simple GET request receiving weather info by city name and checking if the content received is JSON or not
TEST_0006()-  is a simple function used for testing simple GET request receiving weather info by city name and extract response content for verification against backend database or datasource.
