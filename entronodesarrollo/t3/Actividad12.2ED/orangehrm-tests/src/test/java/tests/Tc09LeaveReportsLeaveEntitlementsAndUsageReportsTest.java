package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Tc09LeaveReportsLeaveEntitlementsAndUsageReportsTest extends BaseTest {

    @Test
    public void leaveControl() throws InterruptedException {
        login();
        Thread.sleep(2000);

        // Acceder a la sección de "Leave"

        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();

        // Acceder a la opción "Leave Entitlements and Usage Report"

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Leave Entitlements and Usage Report']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/div/label")).click();
        Thread.sleep(2000);

        // Autocompletado del nombre

        WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Employee Name']/../following-sibling::div//input")));
        nameInput.sendKeys("Admin Admin123");

        // Esperar y seleccionar la opción sugerida
        
        By suggestion = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(suggestion)).click();

        driver.findElement(By.xpath("//label[text()='Leave Period']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[normalize-space()='Generate']")).click();
        Thread.sleep(5000);
    }
}
