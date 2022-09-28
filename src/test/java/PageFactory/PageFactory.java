package PageFactory;

import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static WebDriver driver;
    public RegisterPage Register;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public RegisterPage getRegister(){
        if(Register == null){
            Register = new RegisterPage(driver);
        }
        return Register;
    }

}
