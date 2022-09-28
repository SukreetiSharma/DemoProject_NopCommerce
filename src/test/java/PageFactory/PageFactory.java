package PageFactory;

import Pages.BuyGiftCard;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static WebDriver driver;
    public RegisterPage Register;
    public BuyGiftCard GiftCard;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public RegisterPage getRegister(){
        if(Register == null){
            Register = new RegisterPage(driver);
        }
        return Register;
    }

    public BuyGiftCard getGiftcard(){
        if(GiftCard == null){
            GiftCard = new BuyGiftCard(driver);
        }
        return GiftCard;
    }

}
