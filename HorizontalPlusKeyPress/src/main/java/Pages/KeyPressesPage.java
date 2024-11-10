package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {
    private WebDriver driver;
    private By Text = By.id("result");
    private By Input = By.id("target");

    KeyPressesPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void EnterInput(String input)
    {
        WebElement inputElement  = driver.findElement(Input);
        inputElement.sendKeys(input);
    }
    public String GetText()
    {
        String text = driver.findElement(Text).getText();
        return text;
    }


}
