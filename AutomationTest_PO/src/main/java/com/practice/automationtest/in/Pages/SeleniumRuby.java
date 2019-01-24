package com.practice.automationtest.in.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

public class SeleniumRuby extends ArrivalsMother {
	
	private WebDriver driver;
	private WebDriverWait wait;

	static By seleniumClickable = By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img");
	static By descriptionSelenium = By.xpath("//*[@id=\"tab-description\"]/p");
	
	static By DescButton = By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]/a");
//	static By RevButton = By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[2]/a");
	static By RevButton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[2]");
	

	static By comments = By.xpath("//*[@id=\"comments\"]/p");
	static By stock = By.xpath("//*[@id=\"product-160\"]/div[2]/p");
	
	public SeleniumRuby(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void seleniumValidation( String qtd) {

		CommonsButtons.verifyElements(seleniumClickable);
		CommonsButtons.verifyElements(super.imageView);
		CommonsButtons.verifyElements(super.imageClose);
		CommonsButtons.verifyDescription(descriptionSelenium);
		CommonsButtons.fillOutComboBox(super.qtdItens, qtd);
		CommonsButtons.verifyElements(super.addToBasket);
		
		CommonsButtons.clickButton(DescButton);
		CommonsButtons.verifyDescription(descriptionSelenium);	
		CommonsButtons.clickButton(RevButton);

		
		
		/*
		System.out.println("Buy SeleniumRuby " + driver.findElement(stock).getText());
		System.out.println("Reviews comments: "+ driver.findElement(comments).getText());
		System.out.println("Test script 'seleniumArrivalsValidation()' executed successfully.");
		*/
	}
		
	
	

}
