package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc03AdminNationalitiesTest extends BaseTest {

    @Test
    public void addNationality() {
        login(); // Iniciar sesión

        // Navegar a Admin > Nationalities

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Nationalities']"))).click();

        // Hacer clic en el botón Add

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();

        // Escribir la nueva nacionalidad

        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//label[text()='Name']/../following-sibling::div/input")));
        nameInput.sendKeys("Gitano");

        // Guardar

        WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

        // Esperar a que desaparezca el botón (opcional si no hay validación posterior)

        wait.until(ExpectedConditions.invisibilityOf(saveButton));
    }
}
