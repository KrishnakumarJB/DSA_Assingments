package mandatoryHomeWork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class GoIBIBO {

    ChromeDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @Test
    public void goIb() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@data-id='auth-flow-section']//span")).click();
        driver.findElement(By.xpath("//a[@href='/giholidays/']")).click();
        Thread.sleep(3000);

        String currentWindow = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();

        System.out.println(allHandles);
        for(String winHandle:allHandles)
        {
            if (!currentWindow.equalsIgnoreCase(winHandle))
            {
                driver.switchTo().window(winHandle);
            }
        }

        driver.findElement(By.id("fromCity")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("chennai");
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        driver.findElement(By.id("toCity")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("hampi");
        driver.findElement(By.xpath("//div[text()='Hampi']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("departureDate")).click();
//        JavascriptExecutor js =  (JavascriptExecutor) driver;
//        WebElement db =  driver.findElement(By.id("departureDate"));
//        js.executeScript("arguments[0].click();", db);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class= 'DayPicker-Day']/div/p[text()='23']")).click();
        driver.findElement(By.xpath("//div[@class= 'DayPicker-Day']/div/p[text()='30']")).click();

        driver.findElement(By.xpath("//p[text()='Select Rooms']")).click();
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        driver.findElement(By.xpath("//div[text()='Select Filters (Optional)']")).click();

        driver.findElement(By.xpath("//label[text()='With Flights']")).click();
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        driver.findElement(By.id("search_button")).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='SKIP']")).click();

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//div[@class='rc-slider']//div[@role='slider'][2]"))).moveByOffset(30,0);

    }
}
