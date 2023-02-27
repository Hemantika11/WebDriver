package Selenium_Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLogin
{
    public static void main(String[] args)
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("hemarpatel@yahoo.co.uk");
        driver.findElement(By.id("Password")).sendKeys("Tester123");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[4]/button")).click();
    }
}
