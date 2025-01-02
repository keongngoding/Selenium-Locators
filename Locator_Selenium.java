package pengenalan_Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys("keong");
		 driver.findElement(By.name("inputPassword")).sendKeys("ngoding");
		 driver.findElement(By.className("signInBtn")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("keongngoding");
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("keong000@mail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("098726789876");
		 driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).clear();
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("111111111111");
		 driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).clear();
		 driver.findElement(By.cssSelector("input[type='text']:nth-of-type(3)")).sendKeys("222222222222");
//		 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[@class='reset-pwd-btn']")).click();
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		 System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("keong");
		 
	}

}