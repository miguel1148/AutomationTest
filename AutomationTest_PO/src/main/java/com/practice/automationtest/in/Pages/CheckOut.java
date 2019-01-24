package com.practice.automationtest.in.Pages;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

//  TEST CASE 10

public class CheckOut {
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	public CheckOut(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	static By coupon = By.id("coupon_code"); 
	static By applyButton = By.name("apply_coupon");
	
	static By updateButton = By.name("update_cart");
	static By updateBox = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input");
	static By removeButton = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a");
	static By msgFail = By.xpath("//*[@id=\"page-34\"]/div/div[1]/ul/li");
	static By msgSucess = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[1]");
	
	static By subTotal = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[1]/td/span");
	static By total = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span");
	
	static By paymentButton = By.className("checkout-button button alt wc-forward");
	//										*[@id="page-34"]/div/div[1]/div/div/div/a
									
	//*[@id="page-34"]/div/div[1]/div/div/div/a
	
	public static void remove() {
		CommonsButtons.verifyElements(removeButton);
		
	}
	
	public static void cuponDesconto(String cupon) {
		CommonsButtons.fillOutComboBox(coupon, cupon);
		CommonsButtons.clickButton(applyButton);
		
	}
	
	public static void updateBasket(String qtd) {
		
		CommonsButtons.verifyElements(updateBox);
		CommonsButtons.fillOutComboBox(updateBox, "4");
		CommonsButtons.clickButton(updateButton);
		
		
//		int x = 

	}
	
	public static boolean compara() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(subTotal));
		String text1, text2;
		text1 = driver.findElement(subTotal).getText();
		text2 = driver.findElement(total).getText();
		text1 = text1.substring (1);
		text2 = text2.substring (1);
		
		return Double.parseDouble(text2.replace(",", "")) > Double.parseDouble(text1.replace(",", "")); 
		
	}
	//INCLOPETO CLICAR NO PAYMENTBUTTON
	public static void paymentPage() {
		CommonsButtons.verifyElements(paymentButton);
		driver.findElement(paymentButton).click();
	}
	

	
	

}
