package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditLead {


	ChromeDriver driver;

	@BeforeMethod
	public void setUpBrowser(){
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public  void editLead() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String company = "Gotjob Company";
		String phNo = "9988776655";

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("krishna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("new role");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("ff");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("huio@gmail.com");
		WebElement generalSta = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		new Select(generalSta).selectByValue("NY"); 
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updates@mail.com");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(5000);

	}

//	@AfterMethod
//	public void close(){
//		driver.quit();
//	}

}
