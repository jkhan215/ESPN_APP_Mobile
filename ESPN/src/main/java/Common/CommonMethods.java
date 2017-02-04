package Common;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Jubar on 2/3/2017.
 */
public class CommonMethods extends CommonAPI{
    @FindBy(how = How.XPATH,using = "//android.widget.Button[@text='Get Started']")
    public static WebElement btmGetStarted;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text='Next']")
    public static WebElement btmNext;

    public void MainSetup(){
        btmGetStarted.click();
        btmNext.click();
    }



}
