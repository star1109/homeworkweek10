import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
    FirefoxBrowser firefoxBrowser= new FirefoxBrowser();
    firefoxBrowser.firefox();
    }

    public void firefox() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.findElement(By.name("user-name")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("admin123");


        //  driver.close();


    }
}
