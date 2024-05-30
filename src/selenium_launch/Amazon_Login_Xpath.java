package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		WebElement sign=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		sign.click();
		WebElement email= driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("abc@gmail.com");
		WebElement cont= driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		
		

	}

}
