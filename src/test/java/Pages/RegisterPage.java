package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    public static Properties prop;
    String s = RandomStringUtils.randomAlphanumeric(8);
    By Register = By.xpath("//a[contains(text(),'Register')]");
    By Gender = By.xpath("(//input[@name='Gender'])[1]");
    By FName = By.xpath("//input[@name='FirstName']");
    By LName = By.xpath("//input[@name='LastName']");
    By Emails = By.xpath("//input[@name='Email']");
    By Pass = By.xpath("//input[@name='Password']");
    By confirmPass = By.xpath("//input[@name='ConfirmPassword']");
    By Reg = By.xpath("//button[@name='register-button']");
    By Success = By.xpath("//div[contains(text(),'Your registration completed')]");
    By Continue = By.xpath("//a[contains(text(),'Continue')]");
    By LogOut = By.xpath("//a[contains(text(),'Log out')]");

    public RegisterPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void ClickRegister() {
        driver.findElement(Register).click();
    }
    public void FillDetails() {
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Data.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(Gender).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FName));
        driver.findElement(FName).sendKeys(prop.getProperty("Firstname"));
        driver.findElement(LName).sendKeys(prop.getProperty("Lastname"));
        driver.findElement(Emails).sendKeys(s + "@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Pass));
        driver.findElement(Pass).sendKeys(prop.getProperty("Password"));
        driver.findElement(confirmPass).sendKeys(prop.getProperty("ConfirmPassword"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Reg));
        driver.findElement(Reg).click();
    }
    public void VerifyRegister(){
        String actual = driver.findElement(Success).getText();
        Assert.isTrue(actual.equals("Your registration completed"),"Expected result does not match with actual result");
        driver.findElement(Continue).click();
        driver.findElement(LogOut).click();
    }
}
