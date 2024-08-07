import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hello bro
		EdgeDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\madhukar.v\\Downloads\\edgedriver_win64 (1).exe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://hatchjs.com/unable-to-establish-websocket-connection-selenium/");
		driver.findElement(By.cssSelector("button#details-button")).click();
		driver.findElement(By.cssSelector("a.small-link")).click();
		driver.findElement(By.xpath("//input[@id='txtLogin']")).sendKeys("harish");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("yesbank@123");
		driver.findElement(By.id("txtCatpcha")).sendKeys("testing");
		driver.findElement(By.id("ImgBtnLogin")).click();
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.linkText("Transactions")).click();
		driver.findElement(By.partialLinkText(null));
		
		
		
		
		//Select drop = new Select(Workflow);
		//drop.selectByIndex(1);
		//Actions A = new Actions(driver);
		//A.moveToElement(Workflow).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"mnu1n3\"]/table/tbody/tr/td/a")).click();
		
		
		
		System.out.println("Hello");
		
		
		
		
		

	}

}
