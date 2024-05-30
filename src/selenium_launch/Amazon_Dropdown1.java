package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdown1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=appliances");
		s1.selectByVisibleText("Audible Audiobooks");
	
		

	}

}
