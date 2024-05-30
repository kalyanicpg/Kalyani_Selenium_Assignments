package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_A_Xpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/KALYANI/Downloads/learningHTML2.html");
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("KalyaniC");
		WebElement hint= driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Name");
		WebElement pass= driver.findElement(By.xpath("(/html/body/input)[3]"));
		pass.sendKeys("123@abc");
		WebElement fname= driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("Kalyani");
		WebElement boy= driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		boy.click();
		WebElement girl= driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		girl.click();
		WebElement baby= driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		baby.click();
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		WebElement relocate= driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		}
	

}
