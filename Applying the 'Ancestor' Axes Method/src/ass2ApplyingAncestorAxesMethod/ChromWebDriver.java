package ass2ApplyingAncestorAxesMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriver {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://itmeo.com/");

		// Maximize current window
		driver.manage().window().maximize();

	}

	/**
	 * Test using 'Ancestor' Axes Method, Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- 'Ancestor' Axes Method
		WebElement textMethod1 = driver.findElement(By.xpath(
				"//span[text()='Ready-to-use products']//ancestor::ul[@class='features-checklist main-screen__features']"));
		textMethod1.getLocation();
		System.out.println("ex1 DONE Successfully the location of WebElement is =" + textMethod1.getLocation());

		// ex2 ------- 'Ancestor-or-self' Axes Method
		// "input"
		WebElement textMethod2 = driver
				.findElement(By.xpath("//a[text()='or Sign in']//ancestor-or-self::section[@class='cta-section']"));
		textMethod2.getLocation();
		System.out.println("ex2 DONE Successfully the location of WebElement is =" + textMethod2.getLocation());

		// ex3 ------- 'Ancestor' Axes Method with order []
		WebElement textMethod3 = driver
				.findElement(By.xpath("//a[@class='auth-btn right-nav__link']//ancestor::li[1]"));
		System.out.println("ex3 DONE Successfully the location of WebElement is =" + textMethod3.getLocation());

		// ex4 ------- 'Ancestor' Axes Method with same tagname of current node
		WebElement textMethod4 = driver.findElement(By.xpath("//a[text()='Graphic elements']//ancestor::a"));
		textMethod4.getLocation();
		System.out.println("ex4 DONE Successfully the location of WebElement is =" + textMethod4.getLocation());
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
