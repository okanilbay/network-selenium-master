package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox ;
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");
    By goToBasket = new By.ByCssSelector(".header__basketModal.-checkout");
    By clickikon = new By.ByClassName("header__icon -shoppingBag");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){

        return this.searchBox;
    }
    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }

    public void goToCart() {

        click(goToBasket);
        click(clickikon);
        click(goToBasket);
    }




}
