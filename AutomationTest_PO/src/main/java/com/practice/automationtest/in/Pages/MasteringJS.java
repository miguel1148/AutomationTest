package com.practice.automationtest.in.Pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

public class MasteringJS extends ArrivalsMother{
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	static By masteringJs = By.id("text-22-sub_row_1-0-2-2-0");
	static By descriptionJs = By.xpath("//*[@id=\"tab-description\"]/div/div/div/p");
	
	static By DescButton = By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]/a");
	static By RevButton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
								
	static By comments = By.xpath("//*[@id=\"comments\"]/p");
	static By stock = By.xpath("//*[@id=\"product-165\"]/div[2]/p");
	
	static By couponText = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[2]");
	
	
	
	
	
	public MasteringJS(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void JsValidation(String qtd) {
		
		CommonsButtons.verifyElements(masteringJs );
		CommonsButtons.verifyElements(super.imageView);
		CommonsButtons.verifyElements(super.imageClose);
		CommonsButtons.verifyDescription(descriptionJs);
		CommonsButtons.fillOutComboBox(By.xpath("//*[@id=\"product-165\"]/div[2]/form/div/input"), qtd);
		CommonsButtons.verifyElements(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button"));
			
		CommonsButtons.clickButton(DescButton);
		CommonsButtons.verifyDescription(descriptionJs);
		CommonsButtons.clickButton(RevButton);
		
		
		
		

/**
 * 		Break TextCase because the coupon is applicable for the book price > 450 rps
 */
//		wait.until(ExpectedConditions.visibilityOfElementLocated(couponText));
		
//		System.out.println("Buy MasteringJS " + driver.findElement(stock).getText());
//		System.out.println("Reviews comments: "+ driver.findElement(comments).getText());
//		System.out.println("Test script 'masteringJsValidation()' executed successfully.");
	}
	
	
	
	
	

}
