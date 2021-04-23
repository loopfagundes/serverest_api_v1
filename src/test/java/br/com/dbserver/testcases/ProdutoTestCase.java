package br.com.dbserver.testcases;

import br.com.dbserver.bases.ProdutoBaseTest;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ProdutoTestCase extends ProdutoBaseTest {

    @Feature("GET - Produtos")
    @Test(
            description = "O metodo de GET para buscar a lista dos produtos.",
            priority = 6
    )
    public void getListaDosProdutos200() {
        given()
                    .spec(listaProdutosRequest)
                .when()
                    .get()
                .then()
                    .log().all()
                    .spec(listaProdutosResponse);
    }
}