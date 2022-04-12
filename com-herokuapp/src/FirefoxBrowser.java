import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser
{

    public static void main(String[] args) {
        FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
        firefoxBrowser.firefox();

    }

    public void firefox()
    {

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("riya@gmail.com");//sending value to element
        driver.findElement(By.id("password")).sendKeys("1234");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        //  driver.close();

    }



}
