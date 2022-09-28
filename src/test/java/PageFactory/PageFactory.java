package PageFactory;

import Pages.BuyGiftCard;
import Pages.RegisterPage;
import Pages.SearchProduct;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static WebDriver driver;
    public RegisterPage Register;
    public SearchProduct Search;
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

    public SearchProduct getSearch(){
        if(Search == null){
            Search = new SearchProduct(driver);
        }
        return Search;
    }

    public BuyGiftCard getGiftcard(){
        if(GiftCard == null){
            GiftCard = new BuyGiftCard(driver);
        }
        return GiftCard;
    }

}
