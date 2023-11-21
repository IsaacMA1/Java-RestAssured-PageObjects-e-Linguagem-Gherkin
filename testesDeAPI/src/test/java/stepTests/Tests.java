package stepTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import cadastroUser.BaseCadastroUser;
import io.restassured.http.ContentType;
import metodos.Metodos;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests {

	Metodos.FullName randomName = Metodos.generateRandomName();
	String firstName = randomName.getFirstName();
	String lastName = randomName.getLastName();
	String fullName = randomName.getFullName();

	@Test
	public void t01_obterListaVazia() {
		given()

				.when()
					.get("/api/users")

				.then()
					.body ("message", is("Listas de usuarios vazia."))
					.statusCode(200)
					;
					

	}

	@Test
	public void t02_deveCadastrar() {

		BaseCadastroUser user = new BaseCadastroUser(randomName.getFirstName(), "12345", randomName.getFullName());
		
		
		given()
				
				.auth()
				.preemptive()
				.basic("e2etreinamentos", "e2e@123")
				.body(user)
					
				.when()
					.post("/api/users")

				.then()
					.statusCode(201)
					.body("message", is("Usuário cadastrado com sucesso!"))
					;

	}

	@Test
	public void t03_obterLista() {
		given()

				.when()
					.get("/api/users")

				.then()
					.statusCode(200)
					;

	}
	@Test
	public void t04_testDeletarUsers() {
		given()
				
				.when()
					.delete("/api/users")
	
				.then()
						.body("message", is("Todos os usuários foram deletados com sucesso!"))
						.statusCode(200)
						;
	
	}
}
