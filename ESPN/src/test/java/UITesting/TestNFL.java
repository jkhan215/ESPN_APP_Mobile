package UITesting;

import Common.CommonMethods;
import UIESPN.SelectSport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 2/3/2017.
 */
public class TestNFL extends SelectSport {

    @Test(priority = 1)
    public void testSelectNFL(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNFL();
    }

    @Test(priority = 2)
    public void test49ers(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNFL().select49ers();
    }
    @Test(priority = 3)
    public void testBears(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNFL().selectBears();
    }
    @Test(priority = 4)
    public void testBengals(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNFL().selectBengals();
    }
    @Test(priority = 5)
    public void testBills(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        MainSetup();
        SelectSport sp = PageFactory.initElements(ad, SelectSport.class);
        pickNFL().selectBills();
    }
}
