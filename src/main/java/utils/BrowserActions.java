package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class BrowserActions {
    public static WebDriver driver;

    /**
     *Method witch opens browser by passed browser type
     * <p>
     *     Valid options:  chrome, opera, edge
     * </p>
     * @param browserType the browser type which will be opened
     */
    public static void open(String browserType) {
        //if we want to choose different browsers
        switch (browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver =new OperaDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver =new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;
            default:throw new RuntimeException("The browser type that ypu have entered"+browserType+"isIncorrect");
        }

    }
}
