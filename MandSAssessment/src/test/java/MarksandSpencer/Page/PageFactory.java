package MarksandSpencer.Page;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private WomenMouseOver womenMouseOver;
    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

    public WomenMouseOver getWomenMouseOver()
    {
        if (womenMouseOver == null) {
            womenMouseOver = new WomenMouseOver(driver);
        }
        return womenMouseOver;
    }
}
