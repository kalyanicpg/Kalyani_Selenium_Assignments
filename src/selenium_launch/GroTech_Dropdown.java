package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown");
		//demo2
		WebElement f1 = driver.findElement(By.id("Choice1"));
		Select s1 = new Select(f1);
		s1.selectByVisibleText("Demo2");
		
		//SQL15
		WebElement SQL15 = driver.findElement(By.id("Choice9"));
		Select s2 = new Select(SQL15);
		s2.selectByValue("SQL15");
		
		//Night10
		WebElement Night10 = driver.findElement(By.id("Choice6"));
		Select s3 = new Select(Night10);
		s3.selectByVisibleText("Night10");
		
		//Energy15
		WebElement Energy15 = driver.findElement(By.id("Choice4"));
		Select s4 = new Select(Energy15);
		s4.selectByVisibleText("Energy15");
		//QTP10
		WebElement QTP10 = driver.findElement(By.id("Choice8"));
		Select s41 = new Select(QTP10);
		s41.selectByVisibleText("QTP10");
		
		//QTP9
		WebElement QTP9 = driver.findElement(By.id("Choice8"));
		Select s5 = new Select(QTP9);
		s5.selectByVisibleText("QTP9");
		//Energy14
		WebElement Energy14 = driver.findElement(By.id("Choice4"));
		Select s51 = new Select(Energy14);
		s51.selectByVisibleText("Energy14");
		
		//QTP8
		WebElement QTP8 = driver.findElement(By.id("Choice8"));
		Select s6 = new Select(QTP8);
		s6.selectByVisibleText("QTP8");
		//Energy13
		WebElement Energy13 = driver.findElement(By.id("Choice4"));
		Select s61 = new Select(Energy13);
		s51.selectByVisibleText("Energy13");
		
		//QTP8
		WebElement QTP7 = driver.findElement(By.id("Choice8"));
		Select s7 = new Select(QTP7);
		s6.selectByVisibleText("QTP7");
		//Energy12
		WebElement Energy12 = driver.findElement(By.id("Choice4"));
		Select s71 = new Select(Energy12);
		s51.selectByVisibleText("Energy12");
		
		//QTP7
		WebElement QTP6 = driver.findElement(By.id("Choice8"));
		Select s8 = new Select(QTP6);
		s6.selectByVisibleText("QTP6");
		//Energy11
		WebElement Energy11 = driver.findElement(By.id("Choice4"));
		Select s81 = new Select(Energy11);
		s51.selectByVisibleText("Energy11");
		

	}

}
