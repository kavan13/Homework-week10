package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


    public class Multiple_Browser {

        static String browser = "";
        static String baseUrl = "https://www.x-cart.com/";
        static WebDriver driver;

        public  void setBrowser(String browser) {
            if(browser.equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(baseUrl);
                driver.manage().window().maximize();
                String getTittle = driver.getTitle();
                System.out.println(getTittle);
                // driver.close();

            }else if(browser.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(baseUrl);
                driver.manage().window().maximize();
                String getTittle = driver.getTitle();
                System.out.println(getTittle);
                //driver.close();

            }else if(browser.equalsIgnoreCase("edge")){
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                driver.get(baseUrl);
                driver.manage().window().maximize();
                String getTittle = driver.getTitle();
                System.out.println(getTittle);
                driver.close();
            }else if(browser.equalsIgnoreCase("InternetExplorer")){
                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.get(baseUrl);
                driver.manage().window().maximize();
                String getTittle = driver.getTitle();
                System.out.println(getTittle);
                driver.close();
            }else{
                System.out.println("Wrong Browser Name");
            }

        }

        public static void main(String[] args) {
            Multiple_Browser obj = new Multiple_Browser();
            obj.setBrowser(browser);
        }
    }






