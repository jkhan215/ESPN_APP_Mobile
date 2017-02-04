package UIESPN.UiNBA;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 2/3/2017.
 */
public class NBA extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='NBA']")
    public static WebElement nbaBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Finish']")
    public static WebElement btmFinish;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Bucks']")
    public static WebElement bucksBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Bulls']")
    public static WebElement bullsbtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Cavaliers']")
    public static WebElement cavsBtm;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Celtics']")
    public static WebElement celticsBtm;

    public void  selectBucks(){
        nbaBtm.click();
        bucksBtm.click();
        btmFinish.click();
    }
    public void selectBulls(){
        nbaBtm.click();
        bucksBtm.click();
        btmFinish.click();
    }
    public void selectCavs(){
        nbaBtm.click();
        cavsBtm.click();
        btmFinish.click();
    }
    public void selectCeltics(){
        nbaBtm.click();
        celticsBtm.click();
        btmFinish.click();
    }

}
