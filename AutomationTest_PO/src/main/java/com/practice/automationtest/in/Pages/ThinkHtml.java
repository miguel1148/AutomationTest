package com.practice.automationtest.in.Pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

public class ThinkHtml extends ArrivalsMother{


	private WebDriverWait wait;
	private WebDriver driver;
	
	static By thinkHtmlClickable = By.id("text-22-sub_row_1-0-2-1-0");
	static By descriptionHtml = By.xpath("//*[@id=\"tab-description\"]/div/div/div/p");
	static By outOfStok = By.xpath("//*[@id=\"product-163\"]/div[2]/p");
			
	static By DescButton = By.xpath("//*[@id=\"product-163\"]/div[3]/ul/li[1]/a");
	static By RevButton = By.xpath("//*[@id=\"product-163\"]/div[3]/ul/li[2]/a");
	static By comments = By.xpath("//*[@id=\"comments\"]/p");
	
	public ThinkHtml(WebDriver driver, WebDriverWait wait) {

		this.driver = driver;
		this.wait = wait;
	}
	
	
	public void thinkHtmlValidation(String qtd) {
		CommonsButtons.verifyElements(thinkHtmlClickable);
		CommonsButtons.verifyElements(super.imageView);
		CommonsButtons.verifyElements(super.imageClose);
		
		CommonsButtons.clickButton(DescButton);
		CommonsButtons.verifyDescription(descriptionHtml);
		CommonsButtons.clickButton(RevButton);

		System.out.println("Buy Think HTML " + driver.findElement(outOfStok).getText());
		System.out.println("Reviews comments: "+ driver.findElement(comments).getText());
		System.out.println("Test script 'ThinkHtmlArrivalsValidation() executed successfully.");
	}
}
