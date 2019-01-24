package com.practice.automationtest.in.Pages;

import org.openqa.selenium.By;

public abstract class ArrivalsMother {
	
	static By imageView = By.className("images");
	static By imageClose = By.className("pp_close");
	static By addToBasket = By.xpath("//*[@id=\"product-160\"]/div[2]/form/button");
	static By qtdItens = By.xpath("//*[@id=\"product-160\"]/div[2]/form/div/input");

	public ArrivalsMother() {
		super();
		
	}

}
