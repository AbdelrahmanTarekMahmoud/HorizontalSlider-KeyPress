package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderValueId = By.id("range");
    private By sliderElement = By.cssSelector("#content input");

    public HorizontalSliderPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String readSliderValue()
    {
        return driver.findElement(sliderValueId).getText();
    }
    public void moveSlider(int NumberOfMoves)
    {
        WebElement Slider = driver.findElement(sliderElement);
        for(int i = 0 ; i < NumberOfMoves ; i++)
        {
            Slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
