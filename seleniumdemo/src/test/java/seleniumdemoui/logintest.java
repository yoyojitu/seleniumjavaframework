package seleniumdemoui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yoyojitu19@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("jitendra@123");
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
Thread.sleep(500);

driver.switchTo().alert().dismiss();

	}
}
