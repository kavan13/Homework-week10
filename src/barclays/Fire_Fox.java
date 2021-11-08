package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Fox {

    public static void main(String[] args) {


        String baseUrl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        String getTittle = driver.getTitle();
        System.out.println(getTittle);
        driver.close();

    }
}