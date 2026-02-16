package com.tuempresa.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginExitoso() {
        try {
            WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
            username.sendKeys("Admin");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");

            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();

            // Verificar que redirige al dashboard
            WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
            Assert.assertTrue(dashboardHeader.isDisplayed(), "El inicio de sesión no fue exitoso.");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Fallo durante el login: " + e.getMessage());
        }
    }
}