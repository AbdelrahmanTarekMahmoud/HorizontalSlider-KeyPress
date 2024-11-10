package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver;

    private void ClickLink(String link)
    {
        driver.findElement(By.linkText(link)).click();
    }
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage ClickFormAutentication()
    {
        ClickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage ClickDropDown()
    {
        ClickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public KeyPressesPage ClickKeyPresses()
    {
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage ClickHorizontalSliderPage()
    {
        ClickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    
}
