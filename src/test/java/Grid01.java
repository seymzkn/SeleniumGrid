import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {

    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.135:4444"),new ChromeOptions());

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Ich stimme zu']")).click();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

    }
}
