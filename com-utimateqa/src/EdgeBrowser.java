import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
EdgeBrowser edgeBrowser= new EdgeBrowser();
edgeBrowser.edge();

    }

    public void edge(){
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

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
