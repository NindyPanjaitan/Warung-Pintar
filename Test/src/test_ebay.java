//Scenario 1 : Access a Product via category after applying multiple filters

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		driver.findElement(By.id("gh-shop-a")).click();
		driver.findElement(By.cssSelector(
				"#gh-sbc > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > ul:nth-child(4) > li:nth-child(4) > a:nth-child(1)"))
				.click();
		driver.findElement(By.cssSelector("#s0-16-13_2-0-1\\[0\\]-0-0 > ul > li:nth-child(3) > a")).click();
		driver.findElement(By.cssSelector("#s0-16-13-0-1\\[1\\]-0-6-2 > button")).click();
		// driver.findElement(By.xpath("//*[@id=\"c3-mainPanel-Screen%20Size\"]/span")).click();
		driver.findElement(By.cssSelector("#c3-mainPanel-Screen\\%20Size")).click();

	}
}
