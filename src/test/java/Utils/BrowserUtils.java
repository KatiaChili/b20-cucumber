package Utils;//package Utils;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//
//import java.io.File;
//import java.io.IOException;
//
//public class BrowserUtils {
//
//
//    //Click ELEMENT WITH JavaScriptExecutor
//    public static void clickElement(WebDriver driver,WebElement element){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()",element);
//
//    }
//    public static void clickEl(WebDriver driver1,WebElement element1){
//        JavascriptExecutor js = (JavascriptExecutor) driver1;
//        js.executeScript("arguments[0].click()",element1);
//    }
//    public static void scrollEl(WebDriver driver1, WebElement element1){
//        JavascriptExecutor js = (JavascriptExecutor) driver1;
//        js.executeScript("arguments[0].scrollIntoView(true)",element1);
//
//
//
//
//
//    //SCROLLING TO ELEMENT
//    public static void scrollElement(WebDriver driver1, WebElement element1){
//        JavascriptExecutor js = (JavascriptExecutor) driver1;
//        js.executeScript("arguments[0].scrollIntoView(true)",element1);
//    }
//
//    public static void takeScreenshot (WebDriver driver1){
//
//
//        // TAKING SCREENSHOT
//        File file = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
//
//        //SAVING SCREENSHOT
//        String location = System.getProperty("user.dir")+"/src/test/screenshots/";
//
//        File directory = new File(location);
//
//        if (!directory.exists()){
//            directory.mkdir();
//        }try{
//            FileUtils .copyFile(file, new File(location+System.currentTimeMillis()+".png"));
//        }catch (IOException ex){
//            ex.printStackTrace();
//        }
//
//
//
//
//
//
//
//    }
//}}
