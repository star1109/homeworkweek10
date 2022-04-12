import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {


    public static void main(String[] args) {
        EdgeBrowser edgeBrowser = new EdgeBrowser();
        edgeBrowser.edge();

    }

    public void edge() {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("http://the-internet.herokuapp.com/login");// to open the URL

        driver.findElement(By.name("username")).sendKeys("riya@gmail.com");//sending value to element
        driver.findElement(By.id("password")).sendKeys("1234");

        System.out.println("current URL: " + driver.getCurrentUrl());
        System.out.println("Title " + driver.getTitle());
        System.out.println("page source " + driver.getPageSource());
        //driver.close();
    }

}
