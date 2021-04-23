package br.com.dbserver.testcases;

import br.com.dbserver.bases.UsuarioBaseTest;
import br.com.dbserver.utils.PropertiesData;
import io.qameta.allure.Feature;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UsuarioTestCase extends UsuarioBaseTest {

    @Feature("GET - Usuario")
    @Test(
            description = "O metodo de GET para buscar a lista dos usuario.",
            priority = 1
    )
    public void getListaUsuario200() {
        given()
                    .spec(listaUsuarioRequest)
                .when()
                    .get()
                .then()
                    .log().all()
                    .spec(listaUsuarioResponse);
    }

    @Feature("GET - Usuario")
    @Test (
            description = "O metodo de GET para cadastra novo um usuario.",
            priority = 2
    )
    public void getCadastraUsuario201() {
     idUser =
                given()
                    .spec(cadastraUsuarioRequest)
                .when()
                    .post()
                .then()
                    .log().all()
                    .spec(cadastraUsuarioResponse)
                    .extract().path("_id");
        PropertiesData.setPropertiesData("idUser", "ID_USER", idUser);
    }

    @Feature("PUT - Usuario")
    @Test(
            description = "O metodo de PUT para edita cadastra do usuario.",
            priority = 3
    )
    public void putEditaCadastraUsuario200() {
        given()
                    .spec(editaCadastraUsuarioRequest)
                .when()
                    .put("/" + idUser())
                .then()
                    .log().all()
                    .spec(editaCadastraUsuarioResponse);
    }

    @Feature("DEL - Usuario")
    @Test(
            description = "O metodo de DEL para delete um usuario.",
            priority = 4
    )
    public void delDeleteUsuario200() {
        given()
                    .spec(deleteUsuario)
                .when()
                    .delete("/" + idUser())
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK);
    }
}