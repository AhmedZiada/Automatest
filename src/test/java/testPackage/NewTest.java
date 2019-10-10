package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	GoogleHome homePage;

	
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
//		driver = new ChromeDriver();
//		homePage = new GoogleHome(driver);
//		
//		
//	}

	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver","src/test/resources/Drivers/geckodriver");
		 driver = new FirefoxDriver();
		homePage = new GoogleHome(driver);
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	
	
	@Test
	public void navigateToGoogleHomePageAndAssert() {
		homePage.navigateToUrl();
		homePage.assertPageTitleIsCorrect();
	}

    @Test
    public void NavigateForQueryAndAssertSecondResult () {
		
    	homePage.navigateToUrl();
    	homePage.searchForQuery("Shaft_Engine");
    	WebElement searchResult = driver.findElement(By.xpath("(//div[@class='ellip'])[2]"));
    	String resultText = searchResult.getText();
		Boolean isContained = resultText.contains("SHAFT_ENGINE");
		Assert.assertTrue(isContained);

	}
//		@Test
//		public void NavigateAssertGetTiltle2() {
//			driver.navigate().to("https://www.google.com/ncr");
//			String currentTitle = driver.getTitle();
//			Assert.assertEquals(currentTitle, "Google2");
//		}
//		
//		@Test
//		public void NavigateAssertlogo() {
//			driver.navigate().to("https://www.google.com/ncr");
//			boolean gLogo = driver.findElement(By.id("hplogo") ).isDisplayed() ;
//			Assert.assertTrue(gLogo);
//		}
//		
//		
//		@BeforeClass
//		public void beforeClass()
//		{
//			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
//			driver = new ChromeDriver();
//		}
//		
//		@AfterClass
//		public void afterClass()
//		{
//			driver.close();
//		}


//	@Test
//	public void NavigateAssertGetTiltle() {
//		driver.navigate().to("https://www.google.com/ncr");
//		String currentTitle = driver.getTitle();
//		Assert.assertEquals(currentTitle, "Google");
//		System.out.println("Title is :"+ currentTitle);	
//	}
//
//	@Test
//	public void NavigateAssertlogo() {
//		driver.navigate().to("https://www.google.com/ncr");
//		boolean gLogo = driver.findElement(By.id("hplogo") ).isDisplayed() ;
//		Assert.assertTrue(gLogo);
//	}
//	
//	@Test
//	public void NavigateAssertEnterKeys() {
//		
//		driver.navigate().to("https://www.google.com/ncr");
//		WebElement Searchbox = driver.findElement(By.name("q"));
//		Searchbox.sendKeys("SHAFT_ENGINE");
//		Searchbox.sendKeys(Keys.ENTER);
//		WebElement searchResult = driver.findElement(By.xpath("(//div[@class='ellip'])[2]"));
//		String resultText = searchResult.getText();
//		System.out.println(" First result is:" + searchResult  );
//		Boolean isContained = resultText.contains("SHAFT_ENGINE");
//		Assert.assertTrue(isContained);
//}
//
//	

}
