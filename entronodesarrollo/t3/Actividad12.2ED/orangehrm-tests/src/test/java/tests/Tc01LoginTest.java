package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc01LoginTest extends BaseTest {

    @Test
    public void loginValido() {
        // Esperar visibilidad del campo username y completar formulario

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        submitButton.click();

        // Confirmar que se ha accedido al dashboard
        
        wait.until(ExpectedConditions.urlContains("/dashboard"));
    }
}
