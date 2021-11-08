package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        String getTittle = driver.getTitle();
        System.out.println(getTittle);
        driver.close();

    }
}
