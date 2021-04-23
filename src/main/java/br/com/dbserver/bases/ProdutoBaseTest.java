package br.com.dbserver.bases;

import br.com.dbserver.utils.Endpoint;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;

public class ProdutoBaseTest extends Endpoint {
    protected static RequestSpecification listaProdutosRequest;
    protected static ResponseSpecification listaProdutosResponse;

    @BeforeClass
    public void setUp() {
        listaProdutosRequest();
        listaProdutosResponse();
    }

    private static void listaProdutosRequest() {
        listaProdutosRequest = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathProducts())
                .setContentType(ContentType.JSON)
                .build();
    }

    private static void listaProdutosResponse() {
        listaProdutosResponse = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .build();
    }
}