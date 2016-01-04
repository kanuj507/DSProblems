import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BionicLogin {

	public static WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");

		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();
	/*	capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);*/
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Getting webdriver...");
		WebDriver driver = BionicLogin.getIEDriver();
		
		driver.get("https://bbyignition.bestbuy.com");
		Thread.sleep(8000);
		WebElement el=driver.findElement(By.name("login"));
		el.sendKeys("a1100736");
		el=driver.findElement(By.name("passwd"));
		el.sendKeys("Black#09");
		el.wait();
	
	driver.findElement(By.id("Log_On")).click();
	
	driver.findElement(By.xpath("Resources/Icon/ZnV4STZtWGYxSkFXQ1FsVWtvRHBSSVc0Mk9ZPQ--?")).click();

		Thread.sleep(10000);
	}

}
