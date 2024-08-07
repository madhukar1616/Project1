import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "harish";
		String password = "yesbank@123";
		String captcha = "testing";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhukar.v\\OneDrive - Atyati Technologies Pvt Ltd\\Desktop\\Drivers\\Chrome driver\\chromedriver_win32 (1)");
		driver.manage().window().maximize();
		
		driver.get("https://10.0.0.5/internal_test/Base_App/Main_Navigation/GanasevaLogin.aspx");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("txtLogin")).sendKeys(name);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.id("txtCatpcha")).sendKeys(captcha);
		driver.findElement(By.xpath("//input[@name='ImgBtnLogin']")).click();
		
		//int admin = driver.findElements(By.className("mnu1_1 mnu1_3")).size();
		
		
		
		
		

	}

}
