package com.revmo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResetPasswordPage {
    private WebDriver driver;


    public ResetPasswordPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="email_check")
    private WebElement emailInput;

    @FindBy(id="new_password")
    private WebElement passwordInput;

    @FindBy(id="confirm_password")
    private WebElement confirmPasswordInput;

    @FindBy(id="reset_password")
    private WebElement resetPasswordButton;

    public void typeemail(String email){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));

        wdw.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
    }
    public void typePassword(String password){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));

        wdw.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
    }

    public void typeConfirmPassword(String password){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));

        wdw.until(ExpectedConditions.visibilityOf(confirmPasswordInput));
        confirmPasswordInput.sendKeys(password);
    }

    public void clickResetPassword() throws InterruptedException {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));

        wdw.until(ExpectedConditions.elementToBeClickable(resetPasswordButton));
        resetPasswordButton.click();
        Thread.sleep(500);
    }
}
