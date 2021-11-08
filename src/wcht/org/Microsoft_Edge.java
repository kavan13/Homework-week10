package wcht.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_Edge {

    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        String getTittle = driver.getTitle();
        System.out.println(getTittle);
        driver.close();

    }
}
