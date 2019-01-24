package br.org.cesar.test;

import org.junit.Before;
import org.junit.Test;

import br.org.cesar.common.FormularioSimplesPage;
import br.org.cesar.common.HomePage;

/**
 * Classe de testes com cenários relacionados a página inicial
 */
public class FormularioSimplesPageValidation extends BaseTestcase{

	/**
	 * Antes de cada teste acessa a página de formulário simples
	 * @throws Exception
	 */
	@Before
	public void before() throws Exception {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
	}


	/**
	 * Objetivo: Enviar um comentario com sucesso
	 * 
	 * Passos: Preencher campos do formulario com informações validas e submeter
	 * 
	 * Resultado Esperado: Mensagem de sucesso exibida
	 */
	@Test
	public void sendCommentSuccessfully() {
		FormularioSimplesPage.fillOutFormularioSimples("jose", "zecarrera@gmail.com", "website", "mensagem");
		FormularioSimplesPage.assertSuccessMessageIsShown();
	}
	
	/**
	 * Objetivo:  Enviar um comentario sem preencher o nome
	 * 
	 * Passos: Preencher campos do formulario (sem informar o nome) e submeter
	 * 
	 * Resultado Esperado: Mensagem de erro é exibida
	 */
	@Test
	public void sendCommentWithoutName() {
		FormularioSimplesPage.fillOutFormularioSimples("", "zecarrera@gmail.com", "website", "mensagem");
		FormularioSimplesPage.assertErrorMessageIsShown();
		FormularioSimplesPage.assertDetailedErrorMessageIsShown("Nome é obrigatório");
	}
	
	
}
