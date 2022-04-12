import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser
{
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser = new ChromeBrowser();
    chromeBrowser.chrome();
    }

    public void chrome()
    {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.findElement(By.name("user[email]")).sendKeys("Admin@gmail.com");
        driver.findElement(By.id("user[password]")).sendKeys("admin123");


        //  driver.close();



    }

}
