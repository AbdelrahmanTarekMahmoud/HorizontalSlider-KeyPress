package KeyPress;
import Pages.KeyPressesPage;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressTests extends BaseTests {
    @Test
    public void testBackSpace()
    {
        KeyPressesPage keyPressesPage = homePage.ClickKeyPresses();
        keyPressesPage.EnterInput(Keys.BACK_SPACE.toString());
        assertEquals(keyPressesPage.GetText() , "You entered: BACK_SPACE" , "Wrong");
    }

}
