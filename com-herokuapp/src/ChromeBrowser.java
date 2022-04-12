import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.chrome();
    }

    public void chrome()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); // to set the browser driver and its path
        WebDriver driver = new ChromeDriver(); // creating object

        driver.get("http://the-internet.herokuapp.com/login");// to open the URL

        driver.findElement(By.name("username")).sendKeys("tomsmith");//sending value to element
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
     //   driver.close();


    }
}
