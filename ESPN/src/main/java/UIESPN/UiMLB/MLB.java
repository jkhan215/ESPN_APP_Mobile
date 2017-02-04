package UIESPN.UiMLB;

import Common.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 2/3/2017.
 */
public class MLB extends CommonMethods {
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='MLB']")
    public static WebElement mlbBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Finish']")
    public static WebElement btmFinish;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Angels']")
    public static WebElement angelBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Astros']")
    public static WebElement astrosBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Athletics']")
    public static WebElement athleticsBtm;
    @FindBy(how = How.XPATH,using ="//android.widget.TextView[@text='Blue Jays']")
    public static WebElement blueJayBtm;

    public void selectAngels(){
        mlbBtm.click();
        angelBtm.click();
        btmFinish.click();
    }
    public void selectAstros(){
        mlbBtm.click();
        astrosBtm.click();
        btmFinish.click();
    }
    public void selectAthletics(){
        mlbBtm.click();
        athleticsBtm.click();
        btmFinish.click();
    }
    public void selectBlueJay(){
        mlbBtm.click();
        blueJayBtm.click();
        btmNext.click();
    }
}
