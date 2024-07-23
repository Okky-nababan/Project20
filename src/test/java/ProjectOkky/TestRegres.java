package ProjectOkky;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestRegres {

    @Test
    public void testGetlistUser(){
        RestAssured
                .given()
                .when()
                .get( "https://reqres.in/api/users?page=2")
                .then().log().all();
    }

    @Test
    public void testPostCreateUser(){

    }
}
