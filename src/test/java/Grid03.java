import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
public class Grid03 {
    public static void main(String[] args) throws MalformedURLException {

        //1-Desired Capabilities tanimlama

        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setPlatform(Platform.WINDOWS);

        cap.setBrowserName("chrome");

        cap.setVersion("98.0.4758.102");

        //2- Chrome Options
        ChromeOptions options=new ChromeOptions();

        options.merge(cap);

        //3- Hub adresimizi girelim

        WebDriver driver =new RemoteWebDriver(new URL("http://192.168.0.135:4444"),options);

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//div[text()='Ich stimme zu']")).click();

        System.out.println(driver.getCurrentUrl());
    }
}