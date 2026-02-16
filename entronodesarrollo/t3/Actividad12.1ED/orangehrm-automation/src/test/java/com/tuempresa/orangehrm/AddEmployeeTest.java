package com.tuempresa.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class AddEmployeeTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testAgregarEmpleado() {
        try {
            // 1. Iniciar sesión
            driver.get("https://opensource-demo.orangehrmlive.com/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // 2. Navegar a PIM > Add Employee
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();

            // 3. Completar el formulario de nuevo empleado
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("Roberto");
            driver.findElement(By.name("middleName")).sendKeys("Carlos");
            driver.findElement(By.name("lastName")).sendKeys("Pérez");

            // 4. Crear detalles de inicio de sesión
            // Verificar si el toggle para crear detalles de inicio de sesión está presente
            By toggleLocator = By.xpath("//p[contains(text(),'Create Login Details')]/..//span");
            if (driver.findElements(toggleLocator).size() > 0) {
                WebElement toggleLoginDetails = wait.until(ExpectedConditions.elementToBeClickable(toggleLocator));
                toggleLoginDetails.click();

                WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username']/following::input[1]")));
                usernameField.sendKeys("juan.perez");

                WebElement passwordField = driver.findElement(By.xpath("//label[text()='Password']/following::input[1]"));
                passwordField.sendKeys("Password123!");

                WebElement confirmPasswordField = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
                confirmPasswordField.sendKeys("Password123!");

                WebElement statusDropdown = driver.findElement(By.xpath("//label[text()='Status']/following::div[contains(@class,'oxd-select-text')]"));
                statusDropdown.click();

                WebElement enabledOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span[text()='Enabled']")));
                enabledOption.click();
            }

            // 5. Guardar el nuevo empleado
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // 6. Verificar que el empleado fue agregado exitosamente
            boolean enPerfil = wait.until(ExpectedConditions.urlContains("/pim/viewPersonalDetails"));
            Assert.assertTrue(enPerfil, "No se redirigió al perfil del nuevo empleado");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("La prueba falló debido a una excepción: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        // true = lo cierra, false = se queda abierto
        boolean cerrar = false;
        if (cerrar && driver != null) driver.quit();
    }
}