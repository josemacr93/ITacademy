import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThisIsTest {
    @Test
    public void abc(){
        WebDriver driver = new ChromeDriver();
        // opening the window
        driver.get("http://store.demoqa.com/");
        // clicking an account icon
        driver.findElement(By.className("account_icon")).click();
        // typing login
        driver.findElement(By.name("log")).sendKeys("test1995");
        // typing password
        driver.findElement(By.name("pwd")).sendKeys("password");
        // clicking a `login` button
        driver.findElement(By.name("submit")).click();
        // closing the window
        driver.quit();
    }
}

