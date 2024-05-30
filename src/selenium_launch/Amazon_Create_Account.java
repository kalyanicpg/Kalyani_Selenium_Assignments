package selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Create_Account {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement create = driver.findElement(By.id("createAccountSubmit"));
		create.click();
		WebElement name= driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Priyanka");
		WebElement mob = driver.findElement(By.id("ap_phone_number"));
		mob.sendKeys("9857463214");
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("abc@123");
		WebElement verify = driver.findElement(By.id("continue"));
		verify.click();
	}

}
