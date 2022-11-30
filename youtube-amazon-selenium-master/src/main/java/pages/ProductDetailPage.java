package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage{
    By addToSize = new  By.ByClassName("radio-box__label");
    By addToCartButtonLocator = new By.ByClassName("product__buttons");

    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductDetailPage() {

        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }

    public void selectSize(int i) {

        getAllSize().get(i).click();
    }

    private List<WebElement> getAllSize(){

        return findAll(addToSize);
    }
}
