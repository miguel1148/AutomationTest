package br.org.cesar.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;

import br.org.cesar.common.HomePage;
import br.org.cesar.util.Utils;

/**
 * Classe de testes com cenários relacionados a página inicial
 */
public class HomePageValidation extends BaseTestcase{

	@Before
	public void before() throws Exception {  
	}



	/**
	 * Objetivo: Abrir a home screen e verificar o titulo
	 * 
	 * Passos: Navegar para a home screen e verificar o titulo
	 * 
	 * Resultado Esperado: Titulo da home screen está correto
	 */
	@Test
	public void assertHomeScreenTitle() {
			HomePage.clickHomeMenuItem();
			HomePage.isTitleCorrect("Classe de Testes | Testes e Qualidade de Software");
	}

	
	/**
	 * Objetivo: Navegar para a pagina Curso Selenium e verificar o titulo exibido
	 * 
	 * Passos: Navegar para a pagina Curso Selenium, em seguida verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da página está correto
	 */
	@Test
	public void navigateToCursoSeleniumPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Curso Selenium");
		HomePage.isHeaderTitleCorrect("Curso Selenium");
	}
	
	
	/**
	 * Objetivo: Navegar para a pagina Formulario Simples e verificar o titulo
	 * 
	 * Passos: Navegar para a pagina Formulario Simples e verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da página está correto
	 */
	@Test
	public void navigateToFormularioSimplesPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
		HomePage.isHeaderTitleCorrect("Formulário Simples");
	}
	
	
	/**
	 * Objetivo: Página de resultados da busca é exibida corretamente
	 * 
	 * Passos: Realiza busca com texto fixo e verifica o título da página de resultados
	 * 
	 * Resultado Esperado: Título da página de resultados está correto
	 */
	
	
	@After
	public void after() throws Exception {
	}
}
