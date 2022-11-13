package Base;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import java.time.Duration;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;



public class Screensbase {
	public static  AppiumDriver<MobileElement> wd;
    public static AppiumDriver<MobileElement> driver;



   public Screensbase(AppiumDriver<MobileElement> driver2) {
        this.driver=driver2;
    }
    //Function to do scroll down operation on screen
    public static void scrolldown() {
        ///store the elements in the list
        List <MobileElement> lists = wd.findElements(By.xpath("//android.widget.TextView"));
        //fetching all the element
        for(MobileElement e: lists)
            System.out.println(e.getAttribute("text"));
        //getting the dimension and store it in the object
        Dimension dime = Base.getDriver().manage().window().getSize();
        //parsing the dimensions
        int start_x = (int)(dime.width *0.5);
        int start_y = (int)(dime.height *0.7);



       int end_x = (int)(dime.width * 0.5);
        int end_y = (int)(dime.height *0.1);



       TouchAction touch = new TouchAction(wd);
        touch.press(PointOption.point(start_x, start_y))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(end_x, end_y)).release().perform();




    }
    //
    public void touchActionMethod(int x,int y) throws InterruptedException {
        
        new TouchAction(driver)
        .tap(PointOption.point(x,y)).perform();
        Thread.sleep(1000);
    }
    public void swipMethod(double startpercentage, double endpercentage, double anchorpercentage) {
        //LogConfig.log.info("In swip Method");
        Dimension size= driver.manage().window().getSize();
        int anchor = (int)(size.width*anchorpercentage);
        int startpoint=(int)(size.height*startpercentage);
        int endpoint =(int)(size.height*endpercentage);
        new TouchAction(driver)
        .press(point(anchor,startpoint)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endpoint)).release().perform();
    }
}
