package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class AutomacaoTests {

	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}
	
    Elementos elementos = new Elementos();
    Metodos metodos = new Metodos();
	
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	    Executa.abrirNavegador();
	}

	@When("preencher os dados de login")
	public void preencher_os_dados_de_login() {
	   metodos.inserirDados(elementos.getUsername(), "standard_user");
	   metodos.inserirDados(elementos.getPassword(), "secret_sauce");
	}

	@When("clicar em login")
	public void clicar_em_login() {
       metodos.clicar(elementos.getLogin());
	}

	@Then("usuário deve acessar home page")
	public void usuário_deve_acessar_home_page() {
		metodos.validarTexto(elementos.getHomeTxT(),"Products");
	    
	}
	
	
	
	
	
	
	
	
	
	
	
}
