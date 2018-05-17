package helpers;

import base.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public final static String simpleFormatDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
    public final static String screenshotPath = String.format("src/main/resources/screenshots/loginMailRuTestScreenshot_%s.png", simpleFormatDate);

    public static void takeScreenshot(String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)Driver.getInstance().driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileWithPath);
        Files.copy(srcFile.toPath(), destFile.toPath());
    }
}
