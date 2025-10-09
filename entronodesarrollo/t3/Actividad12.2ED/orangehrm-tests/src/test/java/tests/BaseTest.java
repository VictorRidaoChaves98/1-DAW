package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Clase base:
 * - Abre Chrome y accede a la pantalla de login.
 * - Método login() usa los selectores correctos (name="username", name="password").
 * - Usa esperas explícitas para mayor estabilidad.
 * - Cierra el navegador al terminar cada test.
 */

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)

    public void setUp() {

        // Inicializa el navegador de Chrome

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Esperas implícitas y explícitas

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Abre la página de login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    
    /**
     * Login con usuario administrador demo: Admin / admin123
     */

    protected void login() {
        
        // Esperar a que aparezca el campo de usuario y escribir

        WebElement userInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement passInput = driver.findElement(By.name("password"));

        userInput.clear();
        userInput.sendKeys("Admin");
        passInput.clear();
        passInput.sendKeys("admin123");

        // Hacer clic en el botón de login

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Esperar redirección al dashboard
        
        wait.until(ExpectedConditions.urlContains("/dashboard"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}