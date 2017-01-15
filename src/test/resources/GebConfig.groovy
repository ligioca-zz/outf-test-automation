import org.openqa.selenium.chrome.ChromeDriver

def os = System.getProperty("os.name");
if(os.contains("Mac")){ os = "mac" }
if(os.contains("Linux")){ os = "linux"}

driver = {
    System.setProperty('webdriver.chrome.driver', 'src/main/resources/'+ os +'/chromedriver')
    new ChromeDriver()
}

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true