package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_DragDrop6 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[3]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag,drop).perform();

	}

}
