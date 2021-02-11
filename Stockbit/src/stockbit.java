import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stockbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stockbit.com/");
		 
        driver.findElement(By.cssSelector("#landing-wrapper > div.headerlanding > div > div.topmenu > div > div.menuchild-parent.desktop > div > div.button.button-light > a")).click();
//      driver.findElement(By.cssSelector("#username")).sendKeys("panjaitannindy@gmail.com");
//      driver.findElement(By.name("pw")).sendKeys("nindy123z");
//      driver.findElement(By.cssSelector("#loginbutton")).click();
      
        
	}

}
