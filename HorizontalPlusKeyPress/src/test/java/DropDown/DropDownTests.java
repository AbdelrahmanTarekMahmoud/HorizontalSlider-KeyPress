package DropDown;

import Pages.DropDownPage;
import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDowns()
    {
        DropDownPage dropDownPage = homePage.ClickDropDown();
        dropDownPage.dropDownInteract("Option 1");
        var selectedOption = dropDownPage.dropDownResult();
        assertEquals(selectedOption.size() , 1 , "incorrect number of selections");
        assertTrue(selectedOption.contains("Option 1") , "Failed");
    }

}
