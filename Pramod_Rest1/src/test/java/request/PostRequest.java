package request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {
	@Test
	public void createPlaceAPI()
	{
		
		//Task 1. Extract and grab response
		
		RestAssured.baseURI="http://216.10.245.166";
		Response resp=given().
		queryParam("key","AIzaSyBI6XSVSOp9ahSjFp6r2xEPqjTw8dOcC5o").
		body("{"+
				  "\"location\": {"+
				    "\"lat\": -33.8669710,"+
				    "\"lng\": 151.1958750"+
				  "},"+
				  "\"accuracy\": 50,"+
				  "\"name\": \"Google Shoes!\","+
				  "\"phone_number\": \"(02) 9374 4000\","+
				  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				  "\"types\": [\"shoe_store\"],"+
				  "\"website\": \"http://www.google.com.au/\","+
				  "\"language\": \"en-AU\""+
				"}").
		when().
		post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).
		extract().response();
		// Create a place =response (place id)
		// delete Place = (Request - Place id) 
		
		
		
		//Task 2. Grab the place ID from response
		String respstring=resp.asString();
		JsonPath js=new JsonPath(respstring);
		String placeid=js.get("place_id");
		System.out.println("Place id: "+placeid);
		
		
		//Task 3. Place this place ID in Delete request
		given().
		queryParam("key","AIzaSyBI6XSVSOp9ahSjFp6r2xEPqjTw8dOcC5o").
		body("{"+
		"\"place_id\": \""+placeid+"\""+
		"}").
		when().
		post("/maps/api/place/delete/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"));
	
		


		
	}

}
