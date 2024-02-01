import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

        protected WebDriver driver;

        @BeforeEach
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("http://localhost:8080/prisijungti");
            driver.manage().window().maximize();

        }

        @AfterEach
        public void closeBrowser() {
            driver.close();
        }
}
