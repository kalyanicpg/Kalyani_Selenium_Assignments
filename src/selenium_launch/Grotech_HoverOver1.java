package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_HoverOver1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/hoverover/");
		WebElement demo1=driver.findElement(By.xpath("//div[@class='toolrip4']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(demo1).perform();

	}

}
