package Selenium_Homework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_Chrome
{
    public static void main(String[] args)
    {

        //1. Create Instance of webdriver



        //2 Setup Chromedriver-->path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //3 Navigate to Webpage

        driver.get("https://demo.nopcommerce.com/");

    }
}
