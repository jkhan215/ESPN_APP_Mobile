package UIESPN;

import Common.CommonMethods;
import UIESPN.UiMLB.MLB;
import UIESPN.UiNBA.NBA;
import UIESPN.UiNFL.NFL;
import UIESPN.UiNHL.NHL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jubar on 2/3/2017.
 */
public class SelectSport extends CommonMethods {
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[contains(@resource-id,'com.espn.score_center:id/nextText')]")
            public static WebElement nextBtm;
    List<WebElement> listPickSport = new ArrayList<WebElement>();

    public void pickSport (){
        listPickSport = ad.findElements(By.xpath("//android.widget.GridView[contains(@resource-id,'com.espn.score_center:id/available_favorites')]"));
    }
    public NFL pickNFL(){
        listPickSport.get(0).click();
        nextBtm.click();
        return new NFL();
    }
    public NBA pickNBA(){
        listPickSport.get(1).click();
        nextBtm.click();
        return new NBA();
    }
    public MLB pickMLB(){
        listPickSport.get(2).click();
        nextBtm.click();
        return new MLB();
    }
    public NHL pickNHL(){
        listPickSport.get(3).click();
        nextBtm.click();
        return  new NHL();
    }

}

