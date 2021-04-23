package br.com.dbserver.testcases;

import br.com.dbserver.bases.LoginBaseTest;
import br.com.dbserver.utils.PropertiesData;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginTestCase extends LoginBaseTest {

    @Feature("POST - Login e Authorization")
    @Test(
            description = "O metodo de POST para fazer login. Gerar o numero de Authorization.",
            priority = 5
    )
    public void realizaLogin200() {
      author =
        given()
                    .spec(loginRequest)
                .when()
                    .post()
                .then()
                    .log().all()
                    .spec(loginResponse)
                    .extract().path("authorization");
        PropertiesData.setPropertiesData("authorization", "authorization", author);
    }
}