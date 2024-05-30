package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_hoverover {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		WebElement fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashion).perform();
		
		WebElement men = driver.findElement(By.linkText("Men's Top Wear"));
		Select s1 = new Select(men);
		s1.selectByIndex(2);
		
		//WebElement tshirt = driver.findElement(By.linkText("Men's T-Shirts"));
		//tshirt.click();
	}

}
