package wcht.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_Fox {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTittle = driver.getTitle();
        System.out.println(getTittle);
        driver.close();
    }
}
