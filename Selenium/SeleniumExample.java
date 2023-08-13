import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        // Установите путь к файлу драйвера Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexg\\AppData\\Local\\Programs\\Python\\Python311");

        // Создание экземпляра браузера (Chrome)
        WebDriver driver = new ChromeDriver();

        try {
            // Открытие веб-страницы
            driver.get("https://www.example.com");

            // Поиск элемента на странице
            WebElement element = driver.findElement(By.id("element_id"));

            // Выполнение действий с элементом
            element.click();
            element.sendKeys("Hello, Selenium!");

            // Задержка для демонстрации
            Thread.sleep(3000); // Подождать 3 секунды

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрытие браузера
            driver.quit();
        }
    }
}
