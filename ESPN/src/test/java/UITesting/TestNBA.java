package UITesting;

import Common.CommonMethods;
import UIESPN.SelectSport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 2/3/2017.
 */
public class TestNBA  extends SelectSport {
    @Test(priority = 1)
    public void testSelectNBA(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNBA();
    }
    @Test(priority = 2)
    public void testBucks(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNBA().selectBucks();
    }
    @Test(priority = 3)
    public void testBulls(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNBA().selectBulls();
    }
    @Test(priority = 4)
    public void testCavs(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNBA().selectCavs();
    }
    @Test(priority = 5)
    public void testCeltics(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNBA().selectCeltics();
    }
}
