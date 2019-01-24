package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import pages.Contas;
import pages.SeuBarrigaLogin;

public class LoginTeste {
	
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private static SeuBarrigaLogin login;
	private static Contas conta;
	
	@Before
	public void initializer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MiguelRamalho_Dev\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("http://seubarriga.wcaquino.me/login");
		driver.manage().window().maximize();
		login = new SeuBarrigaLogin(driver, wait);
		conta = new Contas(driver, wait);
		
		
	}

	@After
	public void close() {
	//	driver.close();
	}

	/**
	 * Objetivo: Criar um novo usuário
	 * 
	 * Passos: Criar usuario  
	 * 
	 * Resultado Esperado: Assert para validar a mensagen de validação
	 */
	
	@Test
	public void test() {
		login.newUSer("Miguel Ramalho", "coolbrain8888@gmail", "22234fdsr");
	}
	

	/**
	 * Objetivo: Realizar o login e criar uma conta
	 * 
	 * Passos: Inserir senha e email já cadastrado (Login) 
	 * 
	 * Resultado Esperado: Assert para validar a mensagen de validação
	 *
	 */
	@Test
	public void loginTest() {
		login.userLogin("coolbrain88@gmail", "2234fdsr");
		Contas.addConta("MinhaConta3");
		
	}

	
	/**
	 * Objetivo: Realizar o login e criar uma conta
	 * 
	 * Passos: Inserir senha e email já cadastrado (Login) 
	 * 
	 * Resultado Esperado: Assert para validar a mensagen de validação, quebra de teste 
	 * ao tentar criar uma conta que já existe.
	 *
	 *OBS. o valor deve serr do tipo numerico
	 */
	
	@Test
	public void criaMovementacaoTest() {
		login.userLogin("coolbrain88@gmail", "2234fdsr");
		Contas.criaMovimentacao("19/10/2013", "19/10/2018", "descricao","1234.98", "INTERESSADO");
		
		
	}
	
	
	
}



