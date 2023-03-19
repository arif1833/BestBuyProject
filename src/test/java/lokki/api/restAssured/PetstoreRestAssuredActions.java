package lokki.api.restAssured;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import static io.restassured.RestAssured.*;
	import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

	import java.io.File;

	public class PetstoreRestAssuredActions {

		public void createPet(){
			
			given().														//Request Payload
				body(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiRequestPayloads/CreatePetStoreApiRequest.json")).
			when().															//Setting the Header & Request url
				header("Content-Type", "application/json").
				post("https://petstore.swagger.io/v2/pet").
			then().															//Printing Response in console
				log().body().
			and().															//Verify status code
				assertThat().statusCode(200).
			and().															//Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiResponseSchemas/CreatePetStoreApiResponse.json")));
		}
		
		public void updatePet(){
			given().														//Request Payload
				body(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiRequestPayloads/UpdatePetStoreApiRequest.json")).
			when().															//Setting the Header & Request url
				header("Content-Type", "application/json").
				put("https://petstore.swagger.io/v2/pet").
			then().															//Printing Response in console
				log().body().
			and().															//Verify status code
				assertThat().statusCode(200).
			and().															//Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiResponseSchemas/UpdatePetStoreApiResponse.json")));
			}
		
		public void getPet(){
			given().														//Request Payload
			when().															//Setting the Header & Request url
				header("Content-Type", "application/json").
				get("https://petstore.swagger.io/v2/pet/5").
			then().															//Printing Response in console
				log().body().
			and().															//Verify status code
				assertThat().statusCode(200).
			and().															//Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiResponseSchemas/GetPetStoreApiResponse.json")));
			
		}
		
		public void deletePet(){
			given().														//Request Payload
			when().															//Setting the Header & Request url
				header("Content-Type", "application/json").
				delete("https://petstore.swagger.io/v2/pet/5").
			then().															//Printing Response in console
				log().body().
			and().															//Verify status code
				assertThat().statusCode(200).
			and().															//Verify Response using json schema
				body(matchesJsonSchema(new File(System.getProperty("user.dir") 
						+ "/src/test/resource/ApiResponseSchemas/DeletePetStoreApiResponse.json")));
			
		}
	


}
