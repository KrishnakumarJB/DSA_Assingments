package mandatoryHomeWork.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Amazon {

	ChromeDriver driver;

	@BeforeMethod
	public void setUpBrowser(){
		ChromeOptions chrOpt = new ChromeOptions();
		chrOpt.addArguments("--incognito");
		driver = new ChromeDriver(chrOpt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public  void amazon() throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following::input"));
		search.sendKeys("oneplus 9 pro");
		search.sendKeys(Keys.ENTER);

		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		String textPrice = price.getText();
		System.out.println("Price: " + textPrice);
		String noOfRatings = driver
				.findElement(By.xpath("//img[@class='s-image']/following::span[@class='a-size-base s-underline-text']"))
				.getText();
		System.out.println("Ratings : " + noOfRatings);
		driver.findElement(By.xpath("//img[@data-image-index='1']")).click();
		String currentHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String actual : windowHandles) {
			if (!actual.equalsIgnoreCase(currentHandle)) {
				driver.switchTo().window(actual);
			}
		}
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("/Users/krishnajb/Desktopcapture.jpg");
//		FileUtils.copyFile(SrcFile, DestFile);
		driver.findElement(By.name("submit.add-to-cart")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")));
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
		String subTotal = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']//span")).getText();
		System.out.println(subTotal);
		Thread.sleep(5000);
		driver.quit();

	}

}
