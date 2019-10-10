package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleHome {
	
	//variables
	private WebDriver driver;
	private String url = "https://www.google.com/ncr";
	private String title = "Google";
	
	//locators
	private By searchBox = By.name("q");
	
	
	//constructor
	public GoogleHome(WebDriver driver)
	{
		this.driver = driver;
	}

	//keywords
	
	public void navigateToUrl()
	{
		driver.navigate().to(url);
	}
	
	public void assertPageTitleIsCorrect() 
	{
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	public void searchForQuery(String query)
	{
		driver.findElement(searchBox).sendKeys(query,Keys.ENTER);
	}
	
}
