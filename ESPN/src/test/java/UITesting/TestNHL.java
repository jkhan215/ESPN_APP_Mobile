package UITesting;

import Common.CommonMethods;
import UIESPN.SelectSport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 2/3/2017.
 */
public class TestNHL extends SelectSport {
    @Test(priority = 1)
    public void testSelectNHL() {
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNHL();
    }
    @Test(priority = 2)
    public void testAvalanche(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNHL().selectAvalanche();
    }
    @Test(priority = 3)
    public void testBlues(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNHL().selectBlues();
    }
    @Test
    public void testCanadiens(){
        CommonMethods cm = PageFactory.initElements(ad, CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNHL().selectCanadiens();

    }
}
