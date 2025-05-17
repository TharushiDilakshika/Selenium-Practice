import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    public static void main(String[] args) {

        //Open Google
        //Go to Google home page
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
