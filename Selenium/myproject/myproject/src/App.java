import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.example.com");

        // Perform your automation tasks here

        // Close the WebDriver
        driver.quit();
    }
}