package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search");
    By loginMail= By.id("n-input-email");
    By loginPass = By.id("n-input-password");



    public SearchBox(WebDriver driver) {

        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    }

    public void login(String text) {
        type(loginMail , text);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        type(loginPass , text);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
