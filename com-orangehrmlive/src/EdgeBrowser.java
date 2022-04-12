import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser
{
    public static void main(String[] args) {
        EdgeBrowser edgeBrowser = new EdgeBrowser();
        edgeBrowser.edge();
    }

    public void edge()
    {
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.findElement(By.name("txtUsername")).sendKeys("riya");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        //  driver.close();
    }
}
