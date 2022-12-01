package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    SearchBox searchBox ;
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");
    By goToBasket = new By.ByCssSelector(".header__basketModal.-checkout");
    By ClickOnce = new By.ByCssSelector(".header__icon.-shoppingBag");
    By pageGoOn = new By.ByCssSelector(".n-button.-primary.large");
    By logoClick = new By.ByClassName("headerCheckout__logo__img");
    By productDelete = new By.ByClassName("header__basketProductRemove");
    By productDeleteOk = new By.ByCssSelector(".o-removeCartModal__button:last-child");
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
    public void clickBasketLogo(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(ClickOnce);
    }
    public void goToCart() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(goToBasket);
    }

    public void goOn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(pageGoOn);

    }

    public void go_to_home(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(logoClick);
    }

    public void product_delete(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(productDelete);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(productDeleteOk);
    }

}
