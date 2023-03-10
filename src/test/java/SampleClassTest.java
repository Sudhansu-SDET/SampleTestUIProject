import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClassTest {

    @Test
    public void test1() {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudha\\OneDrive\\Documents\\driver\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.google.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");

        System.out.println("The title of the page is : " + driver.getTitle());

        driver.quit();





    }

}

