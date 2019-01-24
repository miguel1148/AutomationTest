package pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeuBarrigaLogin {
	
	private static  WebDriver driver;
	private static  WebDriverWait wait;
	private static VerifyElements utils;

	// Construtor
	public SeuBarrigaLogin(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.utils = new VerifyElements(driver, wait);
	}
	
	
	
	//FIELDS
	static By nomeID = By.id("nome");
	static By emailID = By.id("email");
	static By passID = By.id("senha");
	//BUTTONS
	static By newUser = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a");
	static By cadastrar = By.xpath("/html/body/div[2]/form/input");
	static By entrar = By.xpath("/html/body/div[2]/form/button");
	//MSG
	static By msgSucess = By.xpath("/html/body/div[1]");  	
	
	static By element = By.linkText("<a href=\"/addConta\">Adicionar</a>");
			
			
	
	/**
	 * Cadastrando um novo usuario
	 * @param nome
	 * @param email
	 * @param pass
	 */
	public static void newUSer(String nome, String email, String pass) {
		utils.clickButton(newUser);
		utils.fillOutComboBox(nomeID, nome);
		utils.fillOutComboBox(emailID, email);
		
		utils.fillOutComboBox(passID, pass);
		utils.clickButton(cadastrar);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSucess));
		assertTrue(driver.findElement(msgSucess).getText().equals("Usuário inserido com sucesso"));
		
	}
	
	/**
	 * Efetuando o login
	 * @param email
	 * @param pass
	 */
	public static void userLogin(String email, String pass) {
		utils.fillOutComboBox(emailID, email);
		utils.fillOutComboBox(passID, pass);
		utils.clickButton(entrar);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSucess));
		assertTrue(driver.findElement(msgSucess).getText().equals("Bem vindo, Miguel Ramalho!"));
		
		
	}
	
	
	
			
			
			
}
