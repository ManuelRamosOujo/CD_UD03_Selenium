import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    
    @Test
    public static void main(String[]args){
        
        System.out.println("Pruebas Selenium");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        

        try{
            driver.get("https://es.Wikipedia.org/");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(driver.getTitle()); 
            WebElement footer = driver.findElement(By.tagName("footer"));
            System.out.println(footer.getAttribute("role"));

            List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
            for(WebElement webElement : elementosDiv){
                System.out.println(webElement.getText());
            }

            WebElement cajabusquedas = driver.findElement(By.id("searchInput"));
            WebElement botonbusqueda = driver.findElement(By.id("searchButton"));

            cajabusquedas.sendKeys("Jamón");
            botonbusqueda.sendKeys(Keys.ENTER);

            assertEquals("Jamón", driver.getTitle());

            Thread.sleep(8000);
            driver.quit();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();
    }
    
    @Test
    public void test_1(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://es.Wikipedia.org/");
        driver.get("src/index.html");
    }
}