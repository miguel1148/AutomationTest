package Utils;





import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Coolbrain_dev;  email: miguelramalho51@gmail.com
 *
 */
public class CommonsButtons {
	


	private static  WebDriver driver;
	private static  WebDriverWait wait;
	
	
	private static String seleniumTextDescription = "The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects.";      
	private static String htmlTextDescription = "This book provides you with an intermediate knowledge of HTML. Instead of wandering through loads of theory, we will understand HTML practically so that we can understand the markup of a web page. We have used Notepad for the examples in this book. Alternatively, you can also use Notepad++ or any advanced editor. All you need to do is copy the code and paste it into Notepad. Upon execution, you will get the output as depicted in the screenshots. Screenshots are provided for each piece of sample code.";  
	private static String jsTextDescription = "It would seem that everything that needs to be written about JavaScript has been written. Frankly, it is difficult to find a topic related to JavaScript that has not been discussed ad nauseam. However, JavaScript is changing at a rapid pace. ECMAScript 6 has the potential to transform the language and how we code in it. Node.js has already changed the way in which we write servers in JavaScript. Newer ideas such as React and Flux will drive the next iteration of the language.";
	
	public CommonsButtons(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	static By nextSlider = By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img");
	static By seleniumBook = By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[1]/div[1]/img");
	static By htmlBook = By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[2]/div[1]/img");
	static By jsBook = By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[3]/div[1]/img");
	
	//checam a imagem  add ao carrinho qtd de itens
	static By imageView = By.className("images");
	static By imageClose = By.className("pp_close");
	static By addToBasket = By.xpath("//*[@id=\"product-160\"]/div[2]/form/button");
	static By qtdItens = By.xpath("//*[@id=\"product-160\"]/div[2]/form/div/input");
	
	
	
	/**
	 * Clicando em um botao 
	 * @param button 
	 */
	public static void clickButton(By button) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(button));
		driver.findElement(button).click();
	}
	
	/**
	 * Preenchendo campos com valor para a quantidade de itens
	 * @param value = valor a ser preenchedido, element
	 */
	public static void fillOutComboBox(By element, String value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement qtd = driver.findElement(element);
		qtd.clear();
		qtd.sendKeys(value);
	}

	/**
	 * Checando os tres slides
	 */
	public static void moveSlider() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextSlider));
		WebElement imgSelenium = driver.findElement(seleniumBook);
		driver.findElement(nextSlider).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(htmlBook));
		driver.findElement(nextSlider).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(jsBook));
		driver.findElement(nextSlider).click();
		assertTrue(driver.findElement(seleniumBook).equals(imgSelenium));
	}
	
	/**
	 * Verifica se um "Botão, combo box..." está visivel e ativado antes de aciona-lo
	 * @param element
	 */
	public static void verifyElements(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		boolean submitbuttonPresence = driver.findElement(element).isDisplayed();
		boolean searchIconEnabled = driver.findElement(element).isEnabled();
		if(submitbuttonPresence == true && searchIconEnabled == true ) 
			driver.findElement(element).click();
	}
	
	/**
	 * Verifica se a descrição do livro está correta
	 * @param descricao
	 */
	public static void verifyDescription(By descricao) {
		WebElement elemento = driver.findElement(descricao);
		assertTrue(elemento.getText().equals(seleniumTextDescription) 
				|| elemento.getText().equals(htmlTextDescription)
				|| elemento.getText().equals(jsTextDescription));
	}
	
	/**
	 * Checa a quantidade de "REVIEWS" do livro, se for igual a (0) retorna Failures
	 */
	static By tabReviews = By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[2]/a");
	
	public static void checkReviews(By element, By tab) {
		verifyElements(element);
		WebElement reviewsTab = driver.findElement(tab);
		assertFalse( reviewsTab.getText().equals("REVIEWS (0)"));
		
	}
	
	/**
	 * Checando mensagens exibidas na pag.
	 */
	public static boolean asserts(By msgSucess, String msg) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSucess));
		assertTrue(driver.findElement(msgSucess).getText().equals(msg));
		return true;
	}
	

	
	
	
	
	
}
