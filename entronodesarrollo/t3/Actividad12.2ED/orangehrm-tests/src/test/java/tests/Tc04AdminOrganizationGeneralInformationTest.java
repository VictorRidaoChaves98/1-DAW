package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc04AdminOrganizationGeneralInformationTest extends BaseTest {

    @Test
    public void editGeneralInfo() {
        login(); // Reutilizamos el método de login del BaseTest

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // -------- Navegar a Admin > Organization > General Information --------
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();

        // Acceder a submenú Organization
        WebElement organizationMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")));
        organizationMenu.click();

        // Hacer clic en "General Information"
        WebElement generalInfoLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='General Information']")));
        generalInfoLink.click();

        // -------- Activar modo edición --------
        WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label/span[contains(@class, 'oxd-switch-input')]")));
        editBtn.click();

        // -------- Editar campos con JavaScript --------
        WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//label[text()='Email']/../following-sibling::div/input")));
        js.executeScript("arguments[0].value=''; arguments[0].value=arguments[1];", emailField, "victor@adaits.es");

        WebElement phoneField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//label[text()='Phone']/../following-sibling::div/input")));
        js.executeScript("arguments[0].value=''; arguments[0].value=arguments[1];", phoneField, "123456789");

        WebElement notesField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//label[text()='Notes']/../following-sibling::div/textarea")));
        js.executeScript("arguments[0].value=''; arguments[0].value=arguments[1];", notesField, "Prueba de clase");

        // -------- Guardar --------
        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Save']")));
        saveBtn.click();

        // -------- Confirmar que se guardó correctamente (el botón desaparece) --------
        wait.until(ExpectedConditions.invisibilityOf(saveBtn));
    }
}
