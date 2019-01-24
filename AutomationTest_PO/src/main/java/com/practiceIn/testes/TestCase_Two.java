package com.practiceIn.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice.automationtest.in.Pages.CheckOut;
import com.practice.automationtest.in.Pages.Home;
import com.practice.automationtest.in.Pages.MasteringJS;
import com.practice.automationtest.in.Pages.SeleniumRuby;
import com.practice.automationtest.in.Pages.ThinkHtml;

import Utils.CommonsButtons;

public class TestCase_Two {
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private MasteringJS js;
	private CheckOut check;
	private Home testing;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MiguelRamalho_Dev\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("http://practice.automationtesting.in/");
		
//		driver.get("http://practice.automationtesting.in/basket/");
		
		check = new CheckOut(driver, wait); 
		js = new MasteringJS(driver, wait);
		testing = new Home(driver, wait);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Objetivo: remover o livro da grade.
 	 * O usuário deve ter a possibilidade de remover o livro no momento do check-out também
	 */
	@Test
	public void removeTest() {
		js.JsValidation("5");
		check.remove();
		
	}
	
	
	/**
	 * Objetivo: Utilizar a comboBox para adicionar ou subtrair livros, comparar o total com subtotal
	 * 			 o total deve ser maior que o subtotal porque será add as taxas de roaming
	 * Passos: após a alteração, o botão "Atualizar Cesta" deve estar em modo clicavel.
	 * 	agora clique em Atualizar Cesta para refletir essas mudanças.
	 */
	@Test
	public void updateBasket() {
		js.JsValidation("5");
		check.updateBasket("4");
	
		System.out.println("Total > SubTotal = " + check.compara());
//		check.paymentPage();
	}
	

}
