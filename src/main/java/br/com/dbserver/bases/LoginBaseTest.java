package br.com.dbserver.bases;

import br.com.dbserver.models.LoginModel;
import br.com.dbserver.utils.Endpoint;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;

public class LoginBaseTest extends Endpoint {
    protected static RequestSpecification loginRequest;
    protected static ResponseSpecification loginResponse;
    private LoginModel loginModel = new LoginModel();
    protected static String author;

    @BeforeClass
    public void setUp() {
        loginRequest();
        loginResponse();
    }

    private void loginRequest() {
        loginRequest = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathLogin())
                .setBody(loginModel)
                .setContentType(ContentType.JSON)
                .build();
    }

    private void loginResponse() {
        loginResponse = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .build();
    }
}