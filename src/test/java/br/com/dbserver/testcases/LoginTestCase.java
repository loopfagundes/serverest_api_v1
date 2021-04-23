package br.com.dbserver.testcases;

import br.com.dbserver.bases.LoginBaseTest;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginTestCase extends LoginBaseTest {

    @Feature("POST - Login")
    @Test(
            description = "O metodo de POST para fazer login.",
            priority = 5
    )
    public void realizaLogin200() {
        given()
                    .spec(loginRequest)
                .when()
                    .post()
                .then()
                    .log().all()
                    .spec(loginResponse);
    }
}