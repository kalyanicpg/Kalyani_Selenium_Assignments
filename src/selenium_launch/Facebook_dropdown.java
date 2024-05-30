package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		WebElement Date = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		Select s1= new Select(Date);
		Select s2= new Select(Month);
		Select s3= new Select(Year);
		
		s1.selectByIndex(25);
		s2.selectByValue("3");
		s3.selectByVisibleText("2019");
		

	}

}
