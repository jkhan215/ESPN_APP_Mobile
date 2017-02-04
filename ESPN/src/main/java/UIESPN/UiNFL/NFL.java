package UIESPN.UiNFL;

import Common.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 2/3/2017.
 */
public class NFL extends CommonMethods {
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='NFL']")
    public static WebElement nflBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Finish']")
    public static WebElement btmFinish;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='49ers']")
    public static WebElement ersBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Bears']")
    public static WebElement bearsBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Bengals']")
    public static WebElement bengalsBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Bills']")
    public  static WebElement billsBtm;

    public void select49ers(){
        nflBtm.click();
        ersBtm.click();
        btmFinish.click();
    }
    public void selectBears(){
        nflBtm.click();
        bearsBtm.click();
        btmFinish.click();
    }
    public void selectBengals(){
        nflBtm.click();
        bengalsBtm.click();
        btmFinish.click();
    }
    public void selectBills(){
        nflBtm.click();
        billsBtm.click();
        btmFinish.click();

    }
}
