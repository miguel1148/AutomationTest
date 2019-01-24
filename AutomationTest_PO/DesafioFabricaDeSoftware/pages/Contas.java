package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contas {
	
	private static  WebDriver driver;
	private static  WebDriverWait wait;
	private static VerifyElements utils;

	
//@teste criar movimentação adicionar conta, criar movimentação obs:(a data nao pode ser de hoje), resumo de movimentação exibir movimentação 
	public Contas(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.utils = new VerifyElements(driver, wait);
	}

	//Buttons
	static By contaBtn = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a");
	static By addConta = By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a");
	static By salvar = By.xpath("/html/body/div[2]/form/div[2]/button");
	//Campos p/ criar movimentação 
	static By movimentacaoTipo = By.xpath("//*[@id=\"tipo\"]");
	static By dataMov = By.id("data_transacao");
	static By payDay = By.id("data_pagamento");
	static By desc = By.id("descricao");
	static By interessado = By.id("interessado");
	static By valor = By.id("valor");
	static By status = By.id("status_pago");
	
	
	static By contaNome = By.id("nome");
	static By msgSucess = By.xpath("/html/body/div[1]");
	static By contaMove = By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a");
	
	
	public static void addConta(String nome) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(contaBtn));
		
		utils.clickButton(contaBtn);
		utils.clickButton(addConta);
		utils.fillOutComboBox(contaNome, nome);
		utils.clickButton(salvar);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSucess));
		assertTrue(driver.findElement(msgSucess).getText().equals("Usuário inserido com sucesso"));
		

	}
	
	// REC
	// DESP
	public static void criaMovimentacao(String data, String diaPagamento, String descricao, String value, 
			String inter) {
		utils.clickButton(contaMove);
		wait.until(ExpectedConditions.visibilityOfElementLocated(movimentacaoTipo));
		Select tipo = new Select(driver.findElement(By.id("tipo")));
		tipo.selectByValue("DESP");
		Select conta = new Select(driver.findElement(By.id("conta")));
		conta.selectByValue("7178");
		
		utils.fillOutComboBox(dataMov, data);
		utils.fillOutComboBox(payDay, diaPagamento);
		utils.fillOutComboBox(desc, descricao);
		utils.fillOutComboBox(valor, value );
		utils.fillOutComboBox(interessado, inter);
		driver.findElement(status).click();
	
		driver.findElement(By.xpath("/html/body/div[2]/form/div[4]/button")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
