package MarksandSpencer.Test;

import java.util.concurrent.TimeUnit;

public class TestWomenMouseOver extends BaseClass {
    public static void main(String[] args) {
        urlVerification();
        driver.manage().window().maximize();
        pageFactory.getWomenMouseOver().dropdownmouse();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        verification("//h1[@class='product-listing__title']","Women’s New In");
        close();
    }
}
