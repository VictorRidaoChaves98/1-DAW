package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc05PimAddEmployeeTest extends BaseTest {

    @Test
    public void addEmployee() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Paso 1: login (heredado de BaseTest)
        login();

        // Paso 2: hacer clic en el módulo "PIM"
        WebElement pimTab = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='PIM']/parent::a")));
        pimTab.click();

        // Paso 3: hacer clic en "Add Employee"
        WebElement addEmployeeTab = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class,'oxd-topbar-body-nav-tab-item') and contains(text(),'Add Employee')]")));
        addEmployeeTab.click();

        // Paso 4: esperar a que el formulario de Add Employee esté visible
        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
        WebElement lastNameInput = driver.findElement(By.name("lastName"));

        // Paso 5: rellenar datos
        firstNameInput.sendKeys("Victor");
        lastNameInput.sendKeys("Ridao");

        // Paso 6: esperar a que aparezca y hacer scroll hasta el botón "Save"
        WebElement saveButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[@type='submit']")));
        js.executeScript("arguments[0].scrollIntoView(true);", saveButton);

        // Paso 7: esperar a que desaparezca el loader si aparece
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));

        // Paso 8: clic en "Save"
        saveButton.click();

        // Espera manual final para permitir carga de la siguiente vista
        Thread.sleep(3000);
    }
}
