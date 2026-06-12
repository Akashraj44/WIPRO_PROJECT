package API_test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.containsString;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_request_demo {


public static void main(String[] args) {

    // Base URI
    RestAssured.baseURI = "https://gorest.co.in/";

    System.out.println("============== GET REQUEST ==============");

    // GET Request
    Response getResponse =

            given()

            .when()

                .get("/public/v2/users");

    // Print Response
    System.out.println("Status Code : "
            + getResponse.getStatusCode());

    System.out.println("Response Body : ");
    System.out.println(getResponse.getBody().asString());

    System.out.println("Response Time : "
            + getResponse.getTime());

    System.out.println("Content Type : "
            + getResponse.getContentType());



    System.out.println("\n============== VALIDATIONS ==============");

    // Validations
//  given().when()
//    .get("/public/v2/users/8474981")
//    .then()
//    .statusCode(200)
//    .body("name", equalTo("Trilokanath Abbott"))
//    .body("email", equalTo("abbott_trilokanath@emard.example"))
//    .time(lessThan(5000L))
//    .header("Content-Type",
//    containsString("application/json"))
//    .log().all();
////
//
//
  System.out.println("\n============== JSON EXTRACTION ==============");

  JsonPath jsonPath =
          getResponse.jsonPath();

  // Extract first user details
  int id =
          jsonPath.getInt("[0].id");

  String name =
          jsonPath.getString("[0].name");

  String email =
          jsonPath.getString("[0].email");

  String gender =
          jsonPath.getString("[0].gender");

  String status =
          jsonPath.getString("[0].status");

  System.out.println("ID : " + id);

  System.out.println("Name : " + name);

  System.out.println("Email : " + email);

  System.out.println("Gender : " + gender);

  System.out.println("Status : " + status);
//
 System.out.println("\n============== POST REQUEST ==============");
  
	// Request Body
  String postRequestBody = "{ "
          + "\"user_id\":8474965,"
          + "\"title\":\"API Testing with RestAssured\","
          + "\"body\":\"This is my first post created using RestAssured POST request.\""
          + "}";

  // Bearer Token
  String token = "0da51f69db9733d985472592f28857f27edb0d3bd1d56632bd6441e4d47be2d1";

  // POST Request
  Response postResponse =
          given()
              .header("Authorization", "Bearer " + token)
              .contentType(ContentType.JSON)
              .body(postRequestBody)
          .when()
              .post("/public/v2/posts");

  // Print Response
  System.out.println("Status Code : " + postResponse.getStatusCode());
  System.out.println("Response Body : ");
  System.out.println(postResponse.getBody().asString());
//
//    System.out.println("\n============== PUT REQUEST ==============");
//
//    // PUT Request Body
//    String putRequestBody =
//            "{ \"name\":\"Vaishali\", \"job\":\"Senior Tester\" }";
//
//    // PUT Request
//    given()
//
//        .contentType(ContentType.JSON)
//
//        .body(putRequestBody)
//
//    .when()
//
//        .put("/api/users/2")
//
//    .then()
//
//        .statusCode(200)
//
//        .log().all();
//
//
//
//    System.out.println("\n============== DELETE REQUEST ==============");
//
//    // DELETE Request
//    given()
//
//    .when()
//
//        .delete("/api/users/2")
//
//    .then()
//
//        .statusCode(204)
//
//        .log().all();
//
//
//
//    System.out.println("\n============== PATH PARAMETER ==============");
//
//    // Path Parameter
//    given()
//
//        .pathParam("id", 2)
//
//    .when()
//
//        .get("/api/users/{id}")
//
//    .then()
//
//        .statusCode(200)
//
//        .log().all();
//
//
//
//    System.out.println("\n============== QUERY PARAMETER ==============");
//
//    // Query Parameter
//    given()
//
//        .queryParam("page", 2)
//
//    .when()
//
//        .get("/api/users")
//
//    .then()
//
//        .statusCode(200)
//
//        .log().all();
//
//
//
//    System.out.println("\n============== HEADERS ==============");
//
//    // Headers Example
//    given()
//
//        .header("Content-Type",
//                "application/json")
//
//    .when()
//
//        .get("/api/users/2")
//
//    .then()
//
//        .statusCode(200)
//
//        .log().headers();
//
//
//
//    System.out.println("\n============== BEARER TOKEN AUTH ==============");
//
//    // Bearer Token Example
//
//    String token = "YOUR_TOKEN";
//
//    given()
//
//        .header("Authorization",
//                "Bearer " + token)
//
//    .when()
//
//        .get("https://gorest.co.in/public/v2/users")
//
//    .then()
//
//        .statusCode(200)
//
//        .log().all();
//
//
//
//    System.out.println("\n============== REQUEST CHAINING ==============");
//
//    // POST Request
//    Response chainResponse =
//
//            given()
//
//                .contentType(ContentType.JSON)
//
//                .body(postRequestBody)
//
//            .when()
//
//                .post("/api/users");
//
//    // Extract ID
//    String chainId =
//            chainResponse.jsonPath().getString("id");
//
//    System.out.println("Chain ID : "
//            + chainId);
//
//    // GET using same ID
//    given()
//
//        .pathParam("id", chainId)
//
//    .when()
//
//        .get("/api/users/{id}")
//
//    .then()
//
//        .log().all();
//
//
//
//    System.out.println("\n============== JSON SCHEMA VALIDATION ==============");
//
//    // Schema Validation
//    given()
//
//    .when()
//
//        .get("/api/users/2")
//
//    .then()
//
//        .assertThat()
//
//        .body(matchesJsonSchemaInClasspath(
//                "schema.json"))
//
//        .log().all();
//
//
//
//    System.out.println("\n============== PRINT HEADERS ==============");
//
//    // Print Headers
//    getResponse.getHeaders().forEach(
//            System.out::println);
//
//
//
//    System.out.println("\n============== PRINT COOKIES ==============");
//
//    // Print Cookies
//    getResponse.getCookies().forEach(
//            (k,v) -> System.out.println(
//                    k + " : " + v));
//
//
//
//    System.out.println("\n============== TEST COMPLETED ==============");
}
}
