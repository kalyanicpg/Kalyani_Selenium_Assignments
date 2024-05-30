package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_Doubleclick {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 
		 WebElement gmail = driver.findElement(By.linkText("Gmail"));
		 Actions a1 = new Actions(driver);
		 a1.doubleClick(gmail).perform();

	}

}
