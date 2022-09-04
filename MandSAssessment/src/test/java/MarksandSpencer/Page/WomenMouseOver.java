package MarksandSpencer.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenMouseOver {
    WebDriver driver;
    By viewAll = By.xpath("(//li/a[contains(text(),'View All')])[1]");
    public WomenMouseOver(WebDriver driver)
    {
        this.driver = driver;
    }

    public void dropdownmouse()
    {
        WebElement women = driver.findElement(By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women).perform();
        driver.findElement(viewAll).click();
    }
}
