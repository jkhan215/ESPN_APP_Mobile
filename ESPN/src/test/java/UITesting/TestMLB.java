package UITesting;

import Common.CommonMethods;
import UIESPN.SelectSport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 2/3/2017.
 */
public class TestMLB extends SelectSport {
    @Test(priority = 1)
    public void testSelectMLB() {
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickMLB();
    }
    @Test(priority = 2)
    public void testAngels(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickMLB().selectAngels();
    }
    @Test(priority = 3)
    public void testAstros(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickMLB().selectAstros();
    }
    @Test(priority = 4)
    public void testBlueJays(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickMLB().selectBlueJay();
    }
}
