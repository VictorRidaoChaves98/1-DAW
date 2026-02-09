package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc02AdminJobJobTitleTest extends BaseTest {

    @Test
    public void addJobTitle() {
        login(); // Login reutilizable desde BaseTest

        // Navegar al menú: Admin > Job > Job Titles

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Job ']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Job Titles']"))).click();

        // Hacer clic en el botón "Add"

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();

        // Rellenar el formulario

        WebElement titleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//label[text()='Job Title']/../following-sibling::div/input")));
        titleInput.sendKeys("AAAAAAAAAAAA");

        WebElement descriptionInput = driver.findElement(
                By.xpath("//label[text()='Job Description']/../following-sibling::div/textarea"));
        descriptionInput.sendKeys("AAAAAAAAAAAAAAAA");

        // Guardar

        WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

        // Esperar hasta que el formulario desaparezca o se recargue la tabla (opcional)

        wait.until(ExpectedConditions.invisibilityOf(saveButton));
    }
}
