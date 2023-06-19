package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Nykaa {
    ChromeDriver driver;

    @BeforeMethod
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void nykaaAddProduct() throws InterruptedException {
        Actions actions = new Actions(driver);
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        WebElement brands = driver.findElement(By.xpath("//*[text() = 'brands']"));
        actions.moveToElement(brands).perform();
        WebElement searchBox = driver.findElement(By.id("brandSearchBox"));
        searchBox.clear();
        searchBox.sendKeys("L'Oreal Paris");
        driver.findElement(By.xpath("//div[@id= 'scroller-container']//div/following-sibling::div/a[text()=\"L'Oreal Paris\"]")).click();
        //verify the title
        WebElement verifyTitle = driver.findElement(By.xpath("//h1[contains(text(),\"L'Oreal Paris\")]"));
        Assert.assertTrue(verifyTitle.isDisplayed());
        driver.findElement(By.xpath("//span[contains(text(),\"Sort By : popularity\")]/parent::button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();

        WebElement hair = driver.findElement(By.xpath("//div[@id='first-filter']//ul//span[text()='Hair']"));
        js.executeScript("arguments[0].scrollIntoView();", hair);
        Thread.sleep(2000);
        hair.click();
//        driver.findElement(By.xpath("//div[@id='first-filter']//ul//span[text()='Hair']")).click();
        driver.findElement(By.xpath("//div[@id='first-filter']//ul//span[text()='Hair Care']")).click();
        driver.findElement(By.xpath("//div[@id='first-filter']//ul//span[text()='Shampoo']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
        driver.findElement(By.xpath("//ul[@id='custom-scroll']//div//div//span[text() ='Color Protection']")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"L'Oreal Paris Colour Protect Shampoo\")]")).click();

        String currentWindow = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for(String winHandle:allHandles)
        {
            if (!currentWindow.equalsIgnoreCase(winHandle))
            {
                driver.switchTo().window(winHandle);
            }
        }


        driver.findElement(By.xpath("//span[text()='180ml']")).click();
        WebElement price = driver.findElement(By.xpath("//h1[contains(text(),\"L'Oreal Paris Colour Protect Shampoo\")]/following-sibling::div/following-sibling::div/div/span[2]"));
        String priceOfProduct = price.getText();
        System.out.println(priceOfProduct);

        driver.findElement(By.xpath("//span[text()='180ml']/following::button/following::div/div/div/button/span")).click();

        driver.findElement(By.xpath("//div[@id='headerMenu']/following::div//*[local-name()='svg']")).click();
        String total = driver.findElement(By.xpath("//span[text()='Grand Total']/parent::div/parent::div/div/span")).getText();

        System.out.println(total+"Total price");

        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        driver.findElement(By.xpath("//button[text()='Continue as guest']")).isDisplayed();
        String grandTotal = driver.findElement(By.xpath("//p[text()='Price Details']/parent::div/parent::div/p")).getText();
        System.out.println(grandTotal);
        Thread.sleep(4000);
        driver.quit();
    }
    
}
