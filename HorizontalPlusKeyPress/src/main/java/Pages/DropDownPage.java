package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By DropDownId  = By.id("dropdown");
    public DropDownPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void dropDownInteract(String Option)
    {
        Select dropDownElements = new Select(driver.findElement(DropDownId));
        dropDownElements.selectByVisibleText(Option);
    }
    public List<String> dropDownResult()
    {
        Select dropDownElements = new Select(driver.findElement(DropDownId));
        List<WebElement> optionsList =  dropDownElements.getAllSelectedOptions();
        return optionsList.stream().map(e -> e.getText()).collect(Collectors.toList());
    }
}
