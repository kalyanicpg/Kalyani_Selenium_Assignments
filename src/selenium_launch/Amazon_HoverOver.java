package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		//hoverover
		WebElement Account=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Account).perform();
		Account.click();
		//for sign process
		WebElement email= driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("abc@gmail.com");
		WebElement cont= driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();

	}

}
