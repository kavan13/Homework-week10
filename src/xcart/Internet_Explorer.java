package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Explorer {

    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        String getTittle = driver.getTitle();
        System.out.println(getTittle);
        driver.close();

    }
}
