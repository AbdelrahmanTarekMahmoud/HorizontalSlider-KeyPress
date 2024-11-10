package HorizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HorizontalSliderTests  extends BaseTests {
    @Test
    public void TestSliderIncreasment()
    {
        var SliderPage = homePage.ClickHorizontalSliderPage();
        SliderPage.moveSlider(8);
        assertEquals(SliderPage.readSliderValue() , "4" , "Wrong Value");
    }
}
