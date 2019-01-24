package com.practiceIn.testes;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice.automationtest.in.Pages.CheckOut;
import com.practice.automationtest.in.Pages.Home;
import com.practice.automationtest.in.Pages.MasteringJS;
import com.practice.automationtest.in.Pages.SeleniumRuby;
import com.practice.automationtest.in.Pages.ThinkHtml;


public class TestCase_One {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private Home testing;
	private SeleniumRuby selenium;
	private ThinkHtml html;
	private MasteringJS js;
	private CheckOut check;

	@Before
	public void setUp() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MiguelRamalho_Dev\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("http://practice.automationtesting.in/");
	
		driver.manage().window().maximize();
		
		check = new CheckOut(driver, wait); 
		testing = new Home(driver, wait);
		selenium = new SeleniumRuby(driver, wait);
		html = new ThinkHtml(driver, wait);
		js = new MasteringJS(driver, wait);
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
	 * Objetivo: Checar se existem exatamente três slides e três "Arrivals" na home page, posteriormente o valor total add
	 * 			 pelo cliente no carrinho
	 * 
	 * Passos: Click() na imagem dos "Arrivals". Testar se está navegando para a próxima página, 
	 * onde o usuário pode adicionar esse livro em sua cesta. A imagem deve ser clicável e navegar
	 * para a próxima página, onde o usuário pode adicionar esse livro à sua cesta.
	 * 
	 * Resultado esperado: Sucesso na execução dos testes [ testSelenium(), JStest() ].
	 * Quebra de teste p/ HTMLtest(), ao tentar add livros ao carrinho pois não há copias em estoque  
	 */
	
	
	@Test
	public void testSelenium() {
		testing.moveSliders();
		selenium.seleniumValidation("15");
		check.cuponDesconto("krishnasakinala");
//		Home.cartAmmount();
		

	}
	
	

	@Test
	public void HTMLtest() {
		testing.moveSliders();
		html.thinkHtmlValidation("");
		Home.cartAmmount();	
	}
	
	
	@Test
	public void JStest() {
		testing.moveSliders();
		js.JsValidation("1");
		check.cuponDesconto("krishnasakinala");
//		Home.cartAmmount();
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
