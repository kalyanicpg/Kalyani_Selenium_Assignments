package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Launch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement em= driver.findElement(By.id("email"));
		em.sendKeys("abc@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("123@abc");
		WebElement log =driver.findElement(By.name("login"));
		log.click();

	}

}
