package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc06PimReportsTest extends BaseTest {

    @Test
    public void addReport() throws InterruptedException {
        login();

        // Navegar a PIM > Reports

        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Reports']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(1000);

        // Ingresar nombre del reporte

        driver.findElement(By.xpath("//label[text()='Report Name']/../following-sibling::div/input"))
                .sendKeys("Lista de Miembros de la Empresa");

        // Selection Criteria

        driver.findElement(By.xpath("//label[text()='Selection Criteria']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Employment Status']")).click();
        Thread.sleep(500);

        // Include

        driver.findElement(By.xpath("//label[text()='Include']/../following-sibling::div")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Current Employees Only']")).click();
        Thread.sleep(500);

        // Select Display Field Group
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Job']")).click();
        Thread.sleep(500);

        // Display Field Group: Job

        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Job Title']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[2]/div[2]/button/i")).click();
        Thread.sleep(1000);

        // Volver a abrir el mismo campo para añadir otro campo más

        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='Job Category']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[2]/div[2]/button/i")).click();
        Thread.sleep(1000);

        // Guardar reporte

        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        Thread.sleep(3000);

        
        // Esperar confirmación o carga
        Thread.sleep(3000); // puedes reemplazar esto por un assert si quieres comprobar algo específico
    }
}
