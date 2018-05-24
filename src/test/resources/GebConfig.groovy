import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

environments {
    firefox {
        driver = { new FirefoxDriver() }
    }

    chrome {
        driver = { new ChromeDriver() }
    }
}