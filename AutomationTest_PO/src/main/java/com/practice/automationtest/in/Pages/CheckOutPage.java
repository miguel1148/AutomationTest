package com.practice.automationtest.in.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonsButtons;

@Deprecated
public class CheckOutPage {
	
	private static  WebDriver driver;
	private static  WebDriverWait wait;
	
	public CheckOutPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	static By msgFail = By.xpath("//*[@id=\"page-34\"]/div/div[1]/ul");
	static By msgSucess = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[1]");
	
	
	public static void applyCoupon() {
		
		By couponCode = By.id("coupon_code");
		By couponButton = By.name("apply_coupon");
		CommonsButtons.fillOutComboBox(couponCode, "krishnasakinala");
		CommonsButtons.clickButton(couponButton);
		
		
		driver.findElement(msgFail);
	//	System.out.println(teste.getText());
		
	}

}
