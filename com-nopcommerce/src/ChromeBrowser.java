import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser
{
    public void chrome()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        System.out.println("current URL: " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.findElement(By.id("Email")).sendKeys("riya@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("1234");

        //driver.close();

    }
    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.chrome();
    }
}
