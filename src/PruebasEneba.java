import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebasEneba{
    
    @Test
    public void P1(){
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22manuelro/CD_UD03_Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebElement producto;
        WebElement cookies;
        try{
            driver.get("https://www.eneba.com/");
            producto = driver.findElements(By.className("uy1qit")).get(0);
            producto.click();
            
            cookies = driver.findElement(By.xpath("//button[@class='pr0yIU' and @type='button']"));
            cookies.click();

            cookies = driver.findElement(By.xpath("//button[@class='pr0yIU pr0yIU' and @type='button']"));
            cookies.click();

            producto = driver.findElement(By.className("w6wAha"));
            producto.click();
            Thread.sleep(6000);
            driver.quit();
        } catch (InterruptedException e){
            e.printStackTrace();
        }catch(ElementClickInterceptedException e){
            
        }

        driver.quit();
    }
}