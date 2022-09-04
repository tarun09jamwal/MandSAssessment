package MarksandSpencer.Test;


import MarksandSpencer.Page.PageFactory;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static PageFactory pageFactory;
    static WebDriver driver;

    public static void urlVerification() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.marksandspencer.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pageFactory = new PageFactory(driver);
    }

    public static void close() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.close();
    }

    public static void verification(String locator, String expected) {
        String actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.equals(expected), "Not as Expected");
    }

}
