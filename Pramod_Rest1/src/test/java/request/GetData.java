package request;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;



public class GetData {
	
		
    @Test(enabled=false)
	public void testResponsecode()
	{
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code=resp.getStatusCode();
		
		
		      
		
		System.out.println("Status Code is: "+code);
		
		Assert.assertEquals(code, 200);
		
	}
    
    @Test
   	public void testbody()
   	{
   		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
   		
   		String data=resp.asString();
   		
   		System.out.println("Response Time is: "+resp.getTime());
   		
   		System.out.println("Data is: "+data);
   		
   		 Assert.assertTrue(data.contains("weatherrty"));
   		 		 
   		    		 
   		System.out.println("weater in Response");
   		 
   			
   		
   		
   		
   		
   	}
}
