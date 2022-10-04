package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchProduct {
    WebDriver driver;
    WebDriverWait wait;
    By SearchInput = By.xpath("//input[@name='q']");
    By search = By.xpath("//button[contains(text(),'Search')]");
    By Product = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");

    public SearchProduct(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void AbleTosearch() {
        driver.findElement(SearchInput).sendKeys("Nokia");
        driver.findElement(search).click();
    }

    public void VerifySearchedProduct(){
        String actual = driver.findElement(Product).getText();
        Assert.isTrue(actual.equals("Nokia Lumia 1020"), "Expected result does not match with actual result");

    }
}
