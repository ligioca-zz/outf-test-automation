import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Ligiox on 15/01/17.
 */
public class Testing {

    public void testingFirstTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/Ligiox/Documents/workspace/groovy_project/testingproject/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.print(driver.getTitle());
        driver.quit();
    }
}
