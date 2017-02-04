package UIESPN.UiNHL;

import Common.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 2/3/2017.
 */
public class NHL extends CommonMethods {
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='NHL']")
    public static WebElement nhlBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Avalanche']")
    public static WebElement avalancheBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Blues']")
    public static WebElement bluesBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Canadiens']")
    public static WebElement canadiensBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Finish']")
    public static WebElement btmFinish;

    public void selectAvalanche(){
        nhlBtm.click();
        avalancheBtm.click();
        btmFinish.click();
    }
    public void selectBlues(){
        nhlBtm.click();
        bluesBtm.click();
        btmFinish.click();
    }
    public void selectCanadiens(){
        nhlBtm.click();
        canadiensBtm.click();
        btmFinish.click();
    }
}
