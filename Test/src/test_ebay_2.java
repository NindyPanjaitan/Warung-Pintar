//Scenario 2 : Access a Product via Search

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_ebay_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Macbook");
		driver.findElement(By.cssSelector("#gh-cat")).click();
		driver.findElement(By.cssSelector("#gh-cat > option:nth-child(12)")).click();
		driver.findElement(By.cssSelector("#gh-btn")).click();
	}

}
