package br.com.dbserver.bases;

import br.com.dbserver.models.CadastraUsuarioModel;
import br.com.dbserver.models.EditaCadastraUsuario;
import br.com.dbserver.utils.Endpoint;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;

public class UsuarioBaseTest extends Endpoint {
    protected static RequestSpecification listaUsuarioRequest;
    protected static ResponseSpecification listaUsuarioResponse;
    protected static RequestSpecification cadastraUsuarioRequest;
    protected static ResponseSpecification cadastraUsuarioResponse;
    protected static RequestSpecification editaCadastraUsuarioRequest;
    protected static ResponseSpecification editaCadastraUsuarioResponse;
    protected RequestSpecification deleteUsuario;
    private CadastraUsuarioModel cadastraUsuario = new CadastraUsuarioModel();
    private EditaCadastraUsuario editaCadastraUSuario = new EditaCadastraUsuario();
    protected static String idUser;

    @BeforeClass
    public void setUp() {
        listaUsuarioRequest();
        listaUsuarioResponse();
        cadastraUsuarioRequest();
        cadastraUsuarioResponse();
        editaCadastraUsuarioRequest();
        editaCadastraUsuarioResponse();
        deleteUsuarioRequest();
    }

    private static void listaUsuarioRequest() {
        listaUsuarioRequest = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathUsers())
                .setContentType(ContentType.JSON)
                .build();
    }

    private static void listaUsuarioResponse() {
        listaUsuarioResponse = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .build();
    }

    private void cadastraUsuarioRequest() {
        cadastraUsuarioRequest = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathUsers())
                .setBody(cadastraUsuario)
                .setContentType(ContentType.JSON)
                .build();
    }

    private void cadastraUsuarioResponse() {
        cadastraUsuarioResponse = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_CREATED)
                .expectContentType(ContentType.JSON)
                .build();
    }

    private void editaCadastraUsuarioRequest() {
        editaCadastraUsuarioRequest = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathUsers())
                .setBody(editaCadastraUSuario)
                .setContentType(ContentType.JSON)
                .build();
    }

    private void editaCadastraUsuarioResponse() {
        editaCadastraUsuarioResponse = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .build();
    }

    private void deleteUsuarioRequest() {
        deleteUsuario = new RequestSpecBuilder()
                .setBaseUri(baseUri())
                .setBasePath(basePathUsers())
                .setContentType(ContentType.JSON)
                .build();
    }
}