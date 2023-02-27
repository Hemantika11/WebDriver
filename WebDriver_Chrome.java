package Selenium_Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_Chrome
{
    public static void main(String[] args)
    {

        //2 Setup Chromedriver-->path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");


        //1. Create Instance of webdriver
        WebDriver driver = new ChromeDriver();

        //3 Navigate to Webpage
        driver.get("https://demo.nopcommerce.com/");

        //4 Get Page titile
        System.out.println(driver.getTitle());
        String Title= driver.getTitle();
        System.out.println("Page Title:" +Title);

        //5 Expected VS Actual - Validation
        if (Title.equals(("nopCommerce demo store1")))
        {
            System.out.println("Page title is correct");
        }
        else
        {

            System.out.println("Page title is incorrect");
        }

       if(Title== "nopCommerce demo store1")
        {
            System.out.println("Page title is correct");
        }
        else
        {
            System.out.println("Page title is incorrect");

        }

        //6 Navigation
        driver.findElement(By.className("ico-login")).click();

        //Navigate Back
        driver.navigate().back();

        //Thread.sleep(5000);

        //Navigate Forward

        driver.navigate().forward();

        //7 Maximize the window

        driver.manage().window().maximize();

        //Minimize the window
        //driver.manage().window().minimize();

        //8 Refresh the page
        driver.navigate().refresh();

        //9 Get current URL
        String Url=driver.getCurrentUrl();
        System.out.println("Current Url:"+Url);

        //10 Close the browser
        driver.quit();

        //11.Close the particulartab or window
        driver.close();

    }
}
