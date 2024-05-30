package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_R_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KALYANI/Downloads/learningHTML2.html");
		WebElement un = driver.findElement(By.xpath("//input[@id='1']"));
		un.sendKeys("KalyaniC");
		WebElement hint= driver.findElement(By.xpath("//input[@id='2']"));
		hint.sendKeys("Name");
		WebElement pass= driver.findElement(By.xpath("//input[@id='3']"));
		pass.sendKeys("abc@123");
		WebElement fname=driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Kalyani");
		WebElement boy=driver.findElement(By.xpath("//input[@id='123']"));
		boy.click();
		WebElement girl=driver.findElement(By.xpath("//input[@name='name2']"));
		girl.click();
		WebElement baby=driver.findElement(By.xpath("//input[@id='321']"));
		baby.click();
		WebElement male = driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement Checkbox = driver.findElement(By.xpath("(//input)[13]"));
		Checkbox.click();	

	}

}
