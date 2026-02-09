package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc08LeaveEntitlementsEmployeeEntitlementsTest extends BaseTest {

    @Test
    public void assignLeave() {
        login();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navegar a Leave > Employee Entitlements
        clickWhenReady(wait, By.xpath("//span[text()='Leave']"));
        clickWhenReady(wait, By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
        clickWhenReady(wait, By.xpath("//a[text()='Employee Entitlements']"));

        // Escribir nombre y seleccionar del autocompletado
        WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")));
        nameInput.sendKeys("Admin Admin123");

        // Esperar que aparezca la opción en el dropdown y hacer clic
        clickWhenVisible(wait, By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));

        // Seleccionar tipo de permiso
        clickWhenReady(wait, By.xpath("//label[text()='Leave Type']/../following-sibling::div"));
        clickWhenReady(wait, By.xpath("//span[text()='CAN - Vacation']"));

        // Seleccionar periodo de leave
        clickWhenReady(wait, By.xpath("//label[text()='Leave Period']/../following-sibling::div"));
        clickWhenReady(wait, By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));

        // Guardar
        clickWhenReady(wait, By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/button"));
    }

    // Método auxiliar para hacer clic cuando esté disponible
    private void clickWhenReady(WebDriverWait wait, By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    // Método auxiliar para hacer clic cuando el elemento sea visible
    private void clickWhenVisible(WebDriverWait wait, By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }
}
