package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc07PimSearchEmployeeTest extends BaseTest {

    @Test
    public void searchEmployee() {
        login(); // Reutiliza método base

        // Navegar a la sección PIM

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();

        // Introducir el nombre del empleado

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//label[text()='Employee Name']/../following-sibling::div//input")))
            .sendKeys("Admin Admin123");

        // Pulsar el botón de búsqueda

        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[normalize-space()='Search']"))).click();

        // Esperar a que los resultados carguen (opcional: comprobar existencia del empleado)
        
        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//div[contains(@class, 'oxd-table-card')]")));
    }
}
