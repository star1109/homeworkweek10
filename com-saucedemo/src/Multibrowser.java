import java.util.Scanner;

public class Multibrowser
{

    public static void main(String[] args) {
        FirefoxBrowser f1 = new FirefoxBrowser();
        ChromeBrowser c1 = new ChromeBrowser();
        EdgeBrowser e1  =new EdgeBrowser();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the browser you want to open EDGE , FIREFOX, CHROME ");
        String str = sc.nextLine();

        if(str.equalsIgnoreCase("firefox"))
        {
            f1.firefox();
        }
        else if(str.equalsIgnoreCase("chrome"))
        {
            c1.chrome();
        }
        else if(str.equalsIgnoreCase("edge"))
        {
            e1.edge();
        }
    }
}
