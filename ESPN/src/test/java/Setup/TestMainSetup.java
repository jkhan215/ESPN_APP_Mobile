package Setup;

import Base.CommonAPI;
import Common.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Jubar on 2/3/2017.
 */
public class TestMainSetup extends CommonAPI {

    @Test
    public void testSetup(){
        CommonMethods cm = PageFactory.initElements(ad,CommonMethods.class);
        cm.MainSetup();

    }
}
