import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest{
    
    WebDriver driver;
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22manuelro/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testPinha(){
        driver.get("file:///home/sanclemente.local/a22manuelro/CD_UD03_Selenium/src/index.html");
        WebElement Piña = driver.findElement(By.name("pinha"));
        WebElement SinPiña = driver.findElement(By.name("sin_pinha"));
        Piña.click();
        SinPiña.click();
        assertEquals(true, !Piña.isSelected());
        assertEquals(true, SinPiña.isSelected());
    }

    @Test
    public void testRadio(){
        driver.get("file:///home/sanclemente.local/a22manuelro/CD_UD03_Selenium/src/index.html");
        WebElement Fina = driver.findElement(By.xpath("//input[@name='boton' and @value='1']"));
        WebElement Gruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        WebElement Clasica = driver.findElement(By.xpath("//input[@name='boton' and @value='3']"));
        Fina.click();
        Gruesa.click();
        Clasica.click();
        assertEquals(true, !Fina.isSelected());
        assertEquals(true, !Gruesa.isSelected());
        assertEquals(true, Clasica.isSelected());
    }

    @Test
    public void testComo(){
        driver.get("file:///home/sanclemente.local/a22manuelro/CD_UD03_Selenium/src/index.html");
        Select menu = new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);
        menu.selectByValue("2");
    }
}