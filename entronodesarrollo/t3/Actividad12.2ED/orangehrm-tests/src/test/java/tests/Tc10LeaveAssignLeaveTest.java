package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc10LeaveAssignLeaveTest extends BaseTest {

    @Test
    public void assignSpecificLeave() throws InterruptedException {
        login();
        Thread.sleep(2000);

        // Navegar a Leave -> Assign Leave
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Assign Leave']")).click();
        Thread.sleep(2000);

        // Autocompletado del nombre
        WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Employee Name']/../following-sibling::div//input")));
        nameInput.sendKeys("Thomas Kutty Benny");

        By suggestion = By.xpath("//div[@role='listbox']//span[text()='Thomas Kutty Benny']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(suggestion)).click();

        // Leave Type
        driver.findElement(By.xpath("//label[text()='Leave Type']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();
        Thread.sleep(1000);

        // From Date
        WebElement fromDate = driver.findElement(
                By.xpath("//label[text()='From Date']/../following-sibling::div//input"));
        fromDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        fromDate.sendKeys(Keys.DELETE);
        fromDate.sendKeys("2025-05-19");

        // To Date
        WebElement toDate = driver.findElement(
                By.xpath("//label[text()='To Date']/../following-sibling::div//input"));
        toDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        toDate.sendKeys(Keys.DELETE);
        toDate.sendKeys("2025-05-23");
        toDate.sendKeys(Keys.TAB); // quitar foco
        Thread.sleep(1000);

        // Partial Days
        driver.findElement(By.xpath("//label[text()='Partial Days']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='All Days']")).click();
        Thread.sleep(500);

        // Duration
        driver.findElement(By.xpath("//label[text()='Duration']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Half Day - Morning']")).click();

        // Comentarios
        driver.findElement(By.xpath("//textarea")).sendKeys("Prueba");

        // Asignar
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Assign']")).click();
        Thread.sleep(3000);
    }
}
