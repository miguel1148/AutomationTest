package com.practice.automationtest.in.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

public class Home {

	private static WebDriver driver;
	private static WebDriverWait wait;
	private static CommonsButtons utils;

	public Home(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.utils = new CommonsButtons(driver, wait);
	}

	static By shopMenu = By.xpath("//*[@id=\"menu-item-40\"]/a");
	static By homeMenu = By.xpath("//*[@id=\"content\"]/nav/a");
	static By nextSlider = By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img");
	// New Arrivals Elements
	static By thinkHtmlClickable = By.id("text-22-sub_row_1-0-2-1-0");
	static By masteringJs = By.id("text-22-sub_row_1-0-2-2-0");

	static By amount = By.className("amount");
	static By content = By.className("cartcontents");
	
	/**
	 * O que faz: checa o valor total do carrinho
	 */
	public static void  cartAmmount() {
		System.out.println("Total: " + driver.findElement(amount).getText());
		System.out.println("Qtd: " + driver.findElement(content).getText());
		CommonsButtons.clickButton(amount);
	}

	/**
	 * O que faz: Navegar para a pagina Shop e voltar para a Home, valida a exibição dos três Slides  
	 *
	 */
	public static void moveSliders() {
		utils.clickButton(shopMenu);
		utils.clickButton(homeMenu);
		utils.moveSlider();
		System.out.println("Test script 'MoveSliders()' executed successfully.");
	}
	
	//Check Descriptions Test-Cases
		//Espera um elemento estar Visível, Disponível e Acionado na tela para clicar e navegar a proxima page
		//Preenche uma box com 5 livros 
		//****************************************************************************************************
/*		public static void seleniumArrivalsValidation(String qtd) {
			utils.clickButton(shopMenu);
			utils.clickButton(homeMenu);
			
		}
*/
}
