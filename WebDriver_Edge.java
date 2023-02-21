package Selenium_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver_Edge
{

    public static void main(String[] args)
    {


        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
    }
}
