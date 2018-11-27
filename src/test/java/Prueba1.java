import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {
    @Test
    public void GoogleTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Marca");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.className("LC20lb")).click();


    }
}
